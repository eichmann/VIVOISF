package edu.uiowa.slis.VIVOISF.StateOrProvince;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StateOrProvinceHasAddressType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StateOrProvinceHasAddressType currentInstance = null;
	private static final Log log = LogFactory.getLog(StateOrProvinceHasAddressType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StateOrProvinceHasAddressIterator theStateOrProvinceHasAddressIterator = (StateOrProvinceHasAddressIterator)findAncestorWithClass(this, StateOrProvinceHasAddressIterator.class);
			pageContext.getOut().print(theStateOrProvinceHasAddressIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing StateOrProvince for hasAddress tag ", e);
			throw new JspTagException("Error: Can't find enclosing StateOrProvince for hasAddress tag ");
		}
		return SKIP_BODY;
	}
}

