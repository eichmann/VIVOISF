package edu.uiowa.slis.VIVOISF.Email;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmailRecipientType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmailRecipientType currentInstance = null;
	private static final Log log = LogFactory.getLog(EmailRecipientType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmailRecipientIterator theEmailRecipientIterator = (EmailRecipientIterator)findAncestorWithClass(this, EmailRecipientIterator.class);
			pageContext.getOut().print(theEmailRecipientIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Email for recipient tag ", e);
			throw new JspTagException("Error: Can't find enclosing Email for recipient tag ");
		}
		return SKIP_BODY;
	}
}

