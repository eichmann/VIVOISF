package edu.uiowa.slis.VIVOISF.StateOrProvince;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StateOrProvinceGeographicFocusType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StateOrProvinceGeographicFocusType currentInstance = null;
	private static final Log log = LogFactory.getLog(StateOrProvinceGeographicFocusType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StateOrProvinceGeographicFocusIterator theStateOrProvinceGeographicFocusIterator = (StateOrProvinceGeographicFocusIterator)findAncestorWithClass(this, StateOrProvinceGeographicFocusIterator.class);
			pageContext.getOut().print(theStateOrProvinceGeographicFocusIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing StateOrProvince for geographicFocus tag ", e);
			throw new JspTagException("Error: Can't find enclosing StateOrProvince for geographicFocus tag ");
		}
		return SKIP_BODY;
	}
}

