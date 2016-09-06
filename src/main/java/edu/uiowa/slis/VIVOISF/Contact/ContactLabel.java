package edu.uiowa.slis.VIVOISF.Contact;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContactLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContactLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(ContactLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Contact theContact = (Contact)findAncestorWithClass(this, Contact.class);
			if (!theContact.commitNeeded) {
				pageContext.getOut().print(theContact.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Contact for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Contact for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Contact theContact = (Contact)findAncestorWithClass(this, Contact.class);
			return theContact.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Contact for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Contact for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Contact theContact = (Contact)findAncestorWithClass(this, Contact.class);
			theContact.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Contact for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Contact for label tag ");
		}
	}
}

