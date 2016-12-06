package edu.uiowa.slis.VIVOISF.StateOrProvince;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StateOrProvinceHasMaxLatitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StateOrProvinceHasMaxLatitude currentInstance = null;
	private static final Log log = LogFactory.getLog(StateOrProvinceHasMaxLatitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StateOrProvinceHasMaxLatitudeIterator theStateOrProvince = (StateOrProvinceHasMaxLatitudeIterator)findAncestorWithClass(this, StateOrProvinceHasMaxLatitudeIterator.class);
			pageContext.getOut().print(theStateOrProvince.getHasMaxLatitude());
		} catch (Exception e) {
			log.error("Can't find enclosing StateOrProvince for hasMaxLatitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing StateOrProvince for hasMaxLatitude tag ");
		}
		return SKIP_BODY;
	}
}

