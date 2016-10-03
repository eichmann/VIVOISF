package edu.uiowa.slis.VIVOISF.Email;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmailIssuer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmailIssuer currentInstance = null;
	private static final Log log = LogFactory.getLog(EmailIssuer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmailIssuerIterator theEmailIssuerIterator = (EmailIssuerIterator)findAncestorWithClass(this, EmailIssuerIterator.class);
			pageContext.getOut().print(theEmailIssuerIterator.getIssuer());
		} catch (Exception e) {
			log.error("Can't find enclosing Email for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Email for issuer tag ");
		}
		return SKIP_BODY;
	}
}

