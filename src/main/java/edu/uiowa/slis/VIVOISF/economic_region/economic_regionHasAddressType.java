package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionHasAddressType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionHasAddressType currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionHasAddressType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			economic_regionHasAddressIterator theeconomic_regionHasAddressIterator = (economic_regionHasAddressIterator)findAncestorWithClass(this, economic_regionHasAddressIterator.class);
			pageContext.getOut().print(theeconomic_regionHasAddressIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for hasAddress tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for hasAddress tag ");
		}
		return SKIP_BODY;
	}
}

