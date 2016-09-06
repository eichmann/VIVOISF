package edu.uiowa.slis.VIVOISF.Address;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AddressCountry extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AddressCountry currentInstance = null;
	private static final Log log = LogFactory.getLog(AddressCountry.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AddressCountryIterator theAddress = (AddressCountryIterator)findAncestorWithClass(this, AddressCountryIterator.class);
			pageContext.getOut().print(theAddress.getCountry());
		} catch (Exception e) {
			log.error("Can't find enclosing Address for country tag ", e);
			throw new JspTagException("Error: Can't find enclosing Address for country tag ");
		}
		return SKIP_BODY;
	}
}

