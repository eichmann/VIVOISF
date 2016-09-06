package edu.uiowa.slis.VIVOISF.Email;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmailLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmailLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(EmailLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Email theEmail = (Email)findAncestorWithClass(this, Email.class);
			if (!theEmail.commitNeeded) {
				pageContext.getOut().print(theEmail.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Email for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Email for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Email theEmail = (Email)findAncestorWithClass(this, Email.class);
			return theEmail.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Email for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Email for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Email theEmail = (Email)findAncestorWithClass(this, Email.class);
			theEmail.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Email for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Email for label tag ");
		}
	}
}

