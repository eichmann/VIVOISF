package edu.uiowa.slis.VIVOISF.Postdoc;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Postdoc thePostdoc = (Postdoc)findAncestorWithClass(this, Postdoc.class);
			if (!thePostdoc.commitNeeded) {
				pageContext.getOut().print(thePostdoc.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Postdoc for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Postdoc for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Postdoc thePostdoc = (Postdoc)findAncestorWithClass(this, Postdoc.class);
			return thePostdoc.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Postdoc for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Postdoc for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Postdoc thePostdoc = (Postdoc)findAncestorWithClass(this, Postdoc.class);
			thePostdoc.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Postdoc for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Postdoc for subjectURI tag ");
		}
	}
}

