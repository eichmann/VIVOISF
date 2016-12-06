package edu.uiowa.slis.VIVOISF.StateOrProvince;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StateOrProvinceNameShortAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StateOrProvinceNameShortAR currentInstance = null;
	private static final Log log = LogFactory.getLog(StateOrProvinceNameShortAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StateOrProvinceNameShortARIterator theStateOrProvince = (StateOrProvinceNameShortARIterator)findAncestorWithClass(this, StateOrProvinceNameShortARIterator.class);
			pageContext.getOut().print(theStateOrProvince.getNameShortAR());
		} catch (Exception e) {
			log.error("Can't find enclosing StateOrProvince for nameShortAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing StateOrProvince for nameShortAR tag ");
		}
		return SKIP_BODY;
	}
}

