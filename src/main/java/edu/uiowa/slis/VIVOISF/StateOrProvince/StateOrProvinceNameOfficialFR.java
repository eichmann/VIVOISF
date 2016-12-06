package edu.uiowa.slis.VIVOISF.StateOrProvince;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StateOrProvinceNameOfficialFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StateOrProvinceNameOfficialFR currentInstance = null;
	private static final Log log = LogFactory.getLog(StateOrProvinceNameOfficialFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StateOrProvinceNameOfficialFRIterator theStateOrProvince = (StateOrProvinceNameOfficialFRIterator)findAncestorWithClass(this, StateOrProvinceNameOfficialFRIterator.class);
			pageContext.getOut().print(theStateOrProvince.getNameOfficialFR());
		} catch (Exception e) {
			log.error("Can't find enclosing StateOrProvince for nameOfficialFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing StateOrProvince for nameOfficialFR tag ");
		}
		return SKIP_BODY;
	}
}

