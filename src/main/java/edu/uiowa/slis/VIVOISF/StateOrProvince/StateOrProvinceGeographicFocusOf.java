package edu.uiowa.slis.VIVOISF.StateOrProvince;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StateOrProvinceGeographicFocusOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StateOrProvinceGeographicFocusOf currentInstance = null;
	private static final Log log = LogFactory.getLog(StateOrProvinceGeographicFocusOf.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StateOrProvinceGeographicFocusOfIterator theStateOrProvince = (StateOrProvinceGeographicFocusOfIterator)findAncestorWithClass(this, StateOrProvinceGeographicFocusOfIterator.class);
			pageContext.getOut().print(theStateOrProvince.getGeographicFocusOf());
		} catch (Exception e) {
			log.error("Can't find enclosing StateOrProvince for geographicFocusOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing StateOrProvince for geographicFocusOf tag ");
		}
		return SKIP_BODY;
	}
}

