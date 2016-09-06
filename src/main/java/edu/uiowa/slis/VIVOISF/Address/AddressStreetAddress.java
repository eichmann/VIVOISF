package edu.uiowa.slis.VIVOISF.Address;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AddressStreetAddress extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AddressStreetAddress currentInstance = null;
	private static final Log log = LogFactory.getLog(AddressStreetAddress.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AddressStreetAddressIterator theAddress = (AddressStreetAddressIterator)findAncestorWithClass(this, AddressStreetAddressIterator.class);
			pageContext.getOut().print(theAddress.getStreetAddress());
		} catch (Exception e) {
			log.error("Can't find enclosing Address for streetAddress tag ", e);
			throw new JspTagException("Error: Can't find enclosing Address for streetAddress tag ");
		}
		return SKIP_BODY;
	}
}

