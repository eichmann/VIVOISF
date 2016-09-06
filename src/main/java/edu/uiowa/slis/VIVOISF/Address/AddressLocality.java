package edu.uiowa.slis.VIVOISF.Address;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AddressLocality extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AddressLocality currentInstance = null;
	private static final Log log = LogFactory.getLog(AddressLocality.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AddressLocalityIterator theAddress = (AddressLocalityIterator)findAncestorWithClass(this, AddressLocalityIterator.class);
			pageContext.getOut().print(theAddress.getLocality());
		} catch (Exception e) {
			log.error("Can't find enclosing Address for locality tag ", e);
			throw new JspTagException("Error: Can't find enclosing Address for locality tag ");
		}
		return SKIP_BODY;
	}
}

