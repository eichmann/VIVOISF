package edu.uiowa.slis.VIVOISF.Email;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmailIssuerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmailIssuerType currentInstance = null;
	private static final Log log = LogFactory.getLog(EmailIssuerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmailIssuerIterator theEmailIssuerIterator = (EmailIssuerIterator)findAncestorWithClass(this, EmailIssuerIterator.class);
			pageContext.getOut().print(theEmailIssuerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Email for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Email for issuer tag ");
		}
		return SKIP_BODY;
	}
}

