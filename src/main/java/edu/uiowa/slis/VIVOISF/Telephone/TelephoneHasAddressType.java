package edu.uiowa.slis.VIVOISF.Telephone;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TelephoneHasAddressType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TelephoneHasAddressType currentInstance = null;
	private static final Log log = LogFactory.getLog(TelephoneHasAddressType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TelephoneHasAddressIterator theTelephoneHasAddressIterator = (TelephoneHasAddressIterator)findAncestorWithClass(this, TelephoneHasAddressIterator.class);
			pageContext.getOut().print(theTelephoneHasAddressIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Telephone for hasAddress tag ", e);
			throw new JspTagException("Error: Can't find enclosing Telephone for hasAddress tag ");
		}
		return SKIP_BODY;
	}
}

