package edu.uiowa.slis.VIVOISF.Address;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AddressRegion extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AddressRegion currentInstance = null;
	private static final Log log = LogFactory.getLog(AddressRegion.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AddressRegionIterator theAddress = (AddressRegionIterator)findAncestorWithClass(this, AddressRegionIterator.class);
			pageContext.getOut().print(theAddress.getRegion());
		} catch (Exception e) {
			log.error("Can't find enclosing Address for region tag ", e);
			throw new JspTagException("Error: Can't find enclosing Address for region tag ");
		}
		return SKIP_BODY;
	}
}

