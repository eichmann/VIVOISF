package edu.uiowa.slis.VIVOISF.StateOrProvince;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StateOrProvinceRO_0002353Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StateOrProvinceRO_0002353Type currentInstance = null;
	private static final Log log = LogFactory.getLog(StateOrProvinceRO_0002353Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StateOrProvinceRO_0002353Iterator theStateOrProvinceRO_0002353Iterator = (StateOrProvinceRO_0002353Iterator)findAncestorWithClass(this, StateOrProvinceRO_0002353Iterator.class);
			pageContext.getOut().print(theStateOrProvinceRO_0002353Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing StateOrProvince for RO_0002353 tag ", e);
			throw new JspTagException("Error: Can't find enclosing StateOrProvince for RO_0002353 tag ");
		}
		return SKIP_BODY;
	}
}

