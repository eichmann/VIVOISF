package edu.uiowa.slis.VIVOISF.StateOrProvince;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StateOrProvinceRO_0000053Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StateOrProvinceRO_0000053Type currentInstance = null;
	private static final Log log = LogFactory.getLog(StateOrProvinceRO_0000053Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StateOrProvinceRO_0000053Iterator theStateOrProvinceRO_0000053Iterator = (StateOrProvinceRO_0000053Iterator)findAncestorWithClass(this, StateOrProvinceRO_0000053Iterator.class);
			pageContext.getOut().print(theStateOrProvinceRO_0000053Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing StateOrProvince for RO_0000053 tag ", e);
			throw new JspTagException("Error: Can't find enclosing StateOrProvince for RO_0000053 tag ");
		}
		return SKIP_BODY;
	}
}

