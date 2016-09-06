package edu.uiowa.slis.VIVOISF.Email;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmailSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmailSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(EmailSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Email theEmail = (Email)findAncestorWithClass(this, Email.class);
			if (!theEmail.commitNeeded) {
				pageContext.getOut().print(theEmail.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Email for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Email for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Email theEmail = (Email)findAncestorWithClass(this, Email.class);
			return theEmail.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Email for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Email for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Email theEmail = (Email)findAncestorWithClass(this, Email.class);
			theEmail.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Email for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Email for subjectURI tag ");
		}
	}
}

