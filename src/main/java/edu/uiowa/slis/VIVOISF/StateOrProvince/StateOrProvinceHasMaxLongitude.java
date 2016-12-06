package edu.uiowa.slis.VIVOISF.StateOrProvince;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StateOrProvinceHasMaxLongitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StateOrProvinceHasMaxLongitude currentInstance = null;
	private static final Log log = LogFactory.getLog(StateOrProvinceHasMaxLongitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StateOrProvinceHasMaxLongitudeIterator theStateOrProvince = (StateOrProvinceHasMaxLongitudeIterator)findAncestorWithClass(this, StateOrProvinceHasMaxLongitudeIterator.class);
			pageContext.getOut().print(theStateOrProvince.getHasMaxLongitude());
		} catch (Exception e) {
			log.error("Can't find enclosing StateOrProvince for hasMaxLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing StateOrProvince for hasMaxLongitude tag ");
		}
		return SKIP_BODY;
	}
}

