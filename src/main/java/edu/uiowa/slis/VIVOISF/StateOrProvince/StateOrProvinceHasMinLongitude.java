package edu.uiowa.slis.VIVOISF.StateOrProvince;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StateOrProvinceHasMinLongitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StateOrProvinceHasMinLongitude currentInstance = null;
	private static final Log log = LogFactory.getLog(StateOrProvinceHasMinLongitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StateOrProvinceHasMinLongitudeIterator theStateOrProvince = (StateOrProvinceHasMinLongitudeIterator)findAncestorWithClass(this, StateOrProvinceHasMinLongitudeIterator.class);
			pageContext.getOut().print(theStateOrProvince.getHasMinLongitude());
		} catch (Exception e) {
			log.error("Can't find enclosing StateOrProvince for hasMinLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing StateOrProvince for hasMinLongitude tag ");
		}
		return SKIP_BODY;
	}
}

