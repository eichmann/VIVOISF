package edu.uiowa.slis.VIVOISF.StateOrProvince;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StateOrProvinceNameListAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StateOrProvinceNameListAR currentInstance = null;
	private static final Log log = LogFactory.getLog(StateOrProvinceNameListAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StateOrProvinceNameListARIterator theStateOrProvince = (StateOrProvinceNameListARIterator)findAncestorWithClass(this, StateOrProvinceNameListARIterator.class);
			pageContext.getOut().print(theStateOrProvince.getNameListAR());
		} catch (Exception e) {
			log.error("Can't find enclosing StateOrProvince for nameListAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing StateOrProvince for nameListAR tag ");
		}
		return SKIP_BODY;
	}
}

