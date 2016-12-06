package edu.uiowa.slis.VIVOISF.geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class geographical_regionHasAddress extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static geographical_regionHasAddress currentInstance = null;
	private static final Log log = LogFactory.getLog(geographical_regionHasAddress.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			geographical_regionHasAddressIterator thegeographical_regionHasAddressIterator = (geographical_regionHasAddressIterator)findAncestorWithClass(this, geographical_regionHasAddressIterator.class);
			pageContext.getOut().print(thegeographical_regionHasAddressIterator.getHasAddress());
		} catch (Exception e) {
			log.error("Can't find enclosing geographical_region for hasAddress tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for hasAddress tag ");
		}
		return SKIP_BODY;
	}
}

