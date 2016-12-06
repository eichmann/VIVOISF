package edu.uiowa.slis.VIVOISF.StateOrProvince;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StateOrProvinceAgriculturalAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StateOrProvinceAgriculturalAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(StateOrProvinceAgriculturalAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StateOrProvinceAgriculturalAreaYearIterator theStateOrProvince = (StateOrProvinceAgriculturalAreaYearIterator)findAncestorWithClass(this, StateOrProvinceAgriculturalAreaYearIterator.class);
			pageContext.getOut().print(theStateOrProvince.getAgriculturalAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing StateOrProvince for agriculturalAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing StateOrProvince for agriculturalAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

