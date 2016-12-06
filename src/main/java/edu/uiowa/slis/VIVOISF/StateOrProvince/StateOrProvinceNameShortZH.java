package edu.uiowa.slis.VIVOISF.StateOrProvince;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StateOrProvinceNameShortZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StateOrProvinceNameShortZH currentInstance = null;
	private static final Log log = LogFactory.getLog(StateOrProvinceNameShortZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StateOrProvinceNameShortZHIterator theStateOrProvince = (StateOrProvinceNameShortZHIterator)findAncestorWithClass(this, StateOrProvinceNameShortZHIterator.class);
			pageContext.getOut().print(theStateOrProvince.getNameShortZH());
		} catch (Exception e) {
			log.error("Can't find enclosing StateOrProvince for nameShortZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing StateOrProvince for nameShortZH tag ");
		}
		return SKIP_BODY;
	}
}

