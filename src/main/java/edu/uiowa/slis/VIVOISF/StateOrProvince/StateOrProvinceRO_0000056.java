package edu.uiowa.slis.VIVOISF.StateOrProvince;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StateOrProvinceRO_0000056 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StateOrProvinceRO_0000056 currentInstance = null;
	private static final Log log = LogFactory.getLog(StateOrProvinceRO_0000056.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StateOrProvinceRO_0000056Iterator theStateOrProvinceRO_0000056Iterator = (StateOrProvinceRO_0000056Iterator)findAncestorWithClass(this, StateOrProvinceRO_0000056Iterator.class);
			pageContext.getOut().print(theStateOrProvinceRO_0000056Iterator.getRO_0000056());
		} catch (Exception e) {
			log.error("Can't find enclosing StateOrProvince for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing StateOrProvince for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

