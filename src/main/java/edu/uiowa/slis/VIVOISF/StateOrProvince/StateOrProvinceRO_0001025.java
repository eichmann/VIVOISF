package edu.uiowa.slis.VIVOISF.StateOrProvince;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StateOrProvinceRO_0001025 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StateOrProvinceRO_0001025 currentInstance = null;
	private static final Log log = LogFactory.getLog(StateOrProvinceRO_0001025.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StateOrProvinceRO_0001025Iterator theStateOrProvinceRO_0001025Iterator = (StateOrProvinceRO_0001025Iterator)findAncestorWithClass(this, StateOrProvinceRO_0001025Iterator.class);
			pageContext.getOut().print(theStateOrProvinceRO_0001025Iterator.getRO_0001025());
		} catch (Exception e) {
			log.error("Can't find enclosing StateOrProvince for RO_0001025 tag ", e);
			throw new JspTagException("Error: Can't find enclosing StateOrProvince for RO_0001025 tag ");
		}
		return SKIP_BODY;
	}
}

