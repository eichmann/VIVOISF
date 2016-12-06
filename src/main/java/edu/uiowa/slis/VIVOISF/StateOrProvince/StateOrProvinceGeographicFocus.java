package edu.uiowa.slis.VIVOISF.StateOrProvince;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StateOrProvinceGeographicFocus extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StateOrProvinceGeographicFocus currentInstance = null;
	private static final Log log = LogFactory.getLog(StateOrProvinceGeographicFocus.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StateOrProvinceGeographicFocusIterator theStateOrProvinceGeographicFocusIterator = (StateOrProvinceGeographicFocusIterator)findAncestorWithClass(this, StateOrProvinceGeographicFocusIterator.class);
			pageContext.getOut().print(theStateOrProvinceGeographicFocusIterator.getGeographicFocus());
		} catch (Exception e) {
			log.error("Can't find enclosing StateOrProvince for geographicFocus tag ", e);
			throw new JspTagException("Error: Can't find enclosing StateOrProvince for geographicFocus tag ");
		}
		return SKIP_BODY;
	}
}

