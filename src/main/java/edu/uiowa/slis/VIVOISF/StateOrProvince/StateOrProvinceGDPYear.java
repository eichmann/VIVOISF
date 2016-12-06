package edu.uiowa.slis.VIVOISF.StateOrProvince;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StateOrProvinceGDPYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StateOrProvinceGDPYear currentInstance = null;
	private static final Log log = LogFactory.getLog(StateOrProvinceGDPYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StateOrProvinceGDPYearIterator theStateOrProvince = (StateOrProvinceGDPYearIterator)findAncestorWithClass(this, StateOrProvinceGDPYearIterator.class);
			pageContext.getOut().print(theStateOrProvince.getGDPYear());
		} catch (Exception e) {
			log.error("Can't find enclosing StateOrProvince for GDPYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing StateOrProvince for GDPYear tag ");
		}
		return SKIP_BODY;
	}
}

