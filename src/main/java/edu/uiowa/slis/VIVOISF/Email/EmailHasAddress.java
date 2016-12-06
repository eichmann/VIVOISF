package edu.uiowa.slis.VIVOISF.Email;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmailHasAddress extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmailHasAddress currentInstance = null;
	private static final Log log = LogFactory.getLog(EmailHasAddress.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmailHasAddressIterator theEmailHasAddressIterator = (EmailHasAddressIterator)findAncestorWithClass(this, EmailHasAddressIterator.class);
			pageContext.getOut().print(theEmailHasAddressIterator.getHasAddress());
		} catch (Exception e) {
			log.error("Can't find enclosing Email for hasAddress tag ", e);
			throw new JspTagException("Error: Can't find enclosing Email for hasAddress tag ");
		}
		return SKIP_BODY;
	}
}

