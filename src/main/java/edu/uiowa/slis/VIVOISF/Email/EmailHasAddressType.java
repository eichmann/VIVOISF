package edu.uiowa.slis.VIVOISF.Email;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmailHasAddressType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmailHasAddressType currentInstance = null;
	private static final Log log = LogFactory.getLog(EmailHasAddressType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmailHasAddressIterator theEmailHasAddressIterator = (EmailHasAddressIterator)findAncestorWithClass(this, EmailHasAddressIterator.class);
			pageContext.getOut().print(theEmailHasAddressIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Email for hasAddress tag ", e);
			throw new JspTagException("Error: Can't find enclosing Email for hasAddress tag ");
		}
		return SKIP_BODY;
	}
}

