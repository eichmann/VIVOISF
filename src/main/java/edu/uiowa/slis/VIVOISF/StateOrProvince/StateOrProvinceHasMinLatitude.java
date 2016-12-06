package edu.uiowa.slis.VIVOISF.StateOrProvince;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StateOrProvinceHasMinLatitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StateOrProvinceHasMinLatitude currentInstance = null;
	private static final Log log = LogFactory.getLog(StateOrProvinceHasMinLatitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StateOrProvinceHasMinLatitudeIterator theStateOrProvince = (StateOrProvinceHasMinLatitudeIterator)findAncestorWithClass(this, StateOrProvinceHasMinLatitudeIterator.class);
			pageContext.getOut().print(theStateOrProvince.getHasMinLatitude());
		} catch (Exception e) {
			log.error("Can't find enclosing StateOrProvince for hasMinLatitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing StateOrProvince for hasMinLatitude tag ");
		}
		return SKIP_BODY;
	}
}

