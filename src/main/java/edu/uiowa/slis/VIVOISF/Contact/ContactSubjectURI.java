package edu.uiowa.slis.VIVOISF.Contact;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContactSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContactSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(ContactSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Contact theContact = (Contact)findAncestorWithClass(this, Contact.class);
			if (!theContact.commitNeeded) {
				pageContext.getOut().print(theContact.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Contact for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Contact for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Contact theContact = (Contact)findAncestorWithClass(this, Contact.class);
			return theContact.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Contact for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Contact for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Contact theContact = (Contact)findAncestorWithClass(this, Contact.class);
			theContact.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Contact for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Contact for subjectURI tag ");
		}
	}
}

