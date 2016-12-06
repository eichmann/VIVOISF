package edu.uiowa.slis.VIVOISF.StateOrProvince;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StateOrProvinceNameListFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StateOrProvinceNameListFR currentInstance = null;
	private static final Log log = LogFactory.getLog(StateOrProvinceNameListFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StateOrProvinceNameListFRIterator theStateOrProvince = (StateOrProvinceNameListFRIterator)findAncestorWithClass(this, StateOrProvinceNameListFRIterator.class);
			pageContext.getOut().print(theStateOrProvince.getNameListFR());
		} catch (Exception e) {
			log.error("Can't find enclosing StateOrProvince for nameListFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing StateOrProvince for nameListFR tag ");
		}
		return SKIP_BODY;
	}
}

