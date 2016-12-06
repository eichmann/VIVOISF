package edu.uiowa.slis.VIVOISF.Telephone;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TelephoneHasAddress extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TelephoneHasAddress currentInstance = null;
	private static final Log log = LogFactory.getLog(TelephoneHasAddress.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TelephoneHasAddressIterator theTelephoneHasAddressIterator = (TelephoneHasAddressIterator)findAncestorWithClass(this, TelephoneHasAddressIterator.class);
			pageContext.getOut().print(theTelephoneHasAddressIterator.getHasAddress());
		} catch (Exception e) {
			log.error("Can't find enclosing Telephone for hasAddress tag ", e);
			throw new JspTagException("Error: Can't find enclosing Telephone for hasAddress tag ");
		}
		return SKIP_BODY;
	}
}

