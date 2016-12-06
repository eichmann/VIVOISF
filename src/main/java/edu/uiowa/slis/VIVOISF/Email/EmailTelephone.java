package edu.uiowa.slis.VIVOISF.Email;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmailTelephone extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmailTelephone currentInstance = null;
	private static final Log log = LogFactory.getLog(EmailTelephone.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EmailTelephoneIterator theEmail = (EmailTelephoneIterator)findAncestorWithClass(this, EmailTelephoneIterator.class);
			pageContext.getOut().print(theEmail.getTelephone());
		} catch (Exception e) {
			log.error("Can't find enclosing Email for telephone tag ", e);
			throw new JspTagException("Error: Can't find enclosing Email for telephone tag ");
		}
		return SKIP_BODY;
	}
}

