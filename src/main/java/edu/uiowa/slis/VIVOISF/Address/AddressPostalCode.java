package edu.uiowa.slis.VIVOISF.Address;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AddressPostalCode extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AddressPostalCode currentInstance = null;
	private static final Log log = LogFactory.getLog(AddressPostalCode.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AddressPostalCodeIterator theAddress = (AddressPostalCodeIterator)findAncestorWithClass(this, AddressPostalCodeIterator.class);
			pageContext.getOut().print(theAddress.getPostalCode());
		} catch (Exception e) {
			log.error("Can't find enclosing Address for postalCode tag ", e);
			throw new JspTagException("Error: Can't find enclosing Address for postalCode tag ");
		}
		return SKIP_BODY;
	}
}

