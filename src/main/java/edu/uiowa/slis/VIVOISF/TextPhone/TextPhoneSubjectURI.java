package edu.uiowa.slis.VIVOISF.TextPhone;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TextPhoneSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TextPhoneSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(TextPhoneSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			TextPhone theTextPhone = (TextPhone)findAncestorWithClass(this, TextPhone.class);
			if (!theTextPhone.commitNeeded) {
				pageContext.getOut().print(theTextPhone.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing TextPhone for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing TextPhone for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			TextPhone theTextPhone = (TextPhone)findAncestorWithClass(this, TextPhone.class);
			return theTextPhone.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing TextPhone for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing TextPhone for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			TextPhone theTextPhone = (TextPhone)findAncestorWithClass(this, TextPhone.class);
			theTextPhone.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing TextPhone for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing TextPhone for subjectURI tag ");
		}
	}
}

