package edu.uiowa.slis.VIVOISF.None;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NoneSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NoneSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(NoneSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			None theNone = (None)findAncestorWithClass(this, None.class);
			if (!theNone.commitNeeded) {
				pageContext.getOut().print(theNone.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing None for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing None for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			None theNone = (None)findAncestorWithClass(this, None.class);
			return theNone.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing None for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing None for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			None theNone = (None)findAncestorWithClass(this, None.class);
			theNone.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing None for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing None for subjectURI tag ");
		}
	}
}

