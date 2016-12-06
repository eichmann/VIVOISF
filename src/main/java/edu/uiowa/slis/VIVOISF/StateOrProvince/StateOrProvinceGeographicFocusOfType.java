package edu.uiowa.slis.VIVOISF.StateOrProvince;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StateOrProvinceGeographicFocusOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StateOrProvinceGeographicFocusOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(StateOrProvinceGeographicFocusOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StateOrProvinceGeographicFocusOfIterator theStateOrProvinceGeographicFocusOfIterator = (StateOrProvinceGeographicFocusOfIterator)findAncestorWithClass(this, StateOrProvinceGeographicFocusOfIterator.class);
			pageContext.getOut().print(theStateOrProvinceGeographicFocusOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing StateOrProvince for geographicFocusOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing StateOrProvince for geographicFocusOf tag ");
		}
		return SKIP_BODY;
	}
}

