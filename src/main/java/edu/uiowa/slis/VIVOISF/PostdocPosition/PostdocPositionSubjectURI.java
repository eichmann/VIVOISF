package edu.uiowa.slis.VIVOISF.PostdocPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocPositionSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocPositionSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocPositionSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			PostdocPosition thePostdocPosition = (PostdocPosition)findAncestorWithClass(this, PostdocPosition.class);
			if (!thePostdocPosition.commitNeeded) {
				pageContext.getOut().print(thePostdocPosition.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing PostdocPosition for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdocPosition for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			PostdocPosition thePostdocPosition = (PostdocPosition)findAncestorWithClass(this, PostdocPosition.class);
			return thePostdocPosition.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing PostdocPosition for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdocPosition for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			PostdocPosition thePostdocPosition = (PostdocPosition)findAncestorWithClass(this, PostdocPosition.class);
			thePostdocPosition.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing PostdocPosition for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdocPosition for subjectURI tag ");
		}
	}
}

