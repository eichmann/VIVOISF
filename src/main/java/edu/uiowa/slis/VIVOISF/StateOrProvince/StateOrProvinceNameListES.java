package edu.uiowa.slis.VIVOISF.StateOrProvince;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StateOrProvinceNameListES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StateOrProvinceNameListES currentInstance = null;
	private static final Log log = LogFactory.getLog(StateOrProvinceNameListES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StateOrProvinceNameListESIterator theStateOrProvince = (StateOrProvinceNameListESIterator)findAncestorWithClass(this, StateOrProvinceNameListESIterator.class);
			pageContext.getOut().print(theStateOrProvince.getNameListES());
		} catch (Exception e) {
			log.error("Can't find enclosing StateOrProvince for nameListES tag ", e);
			throw new JspTagException("Error: Can't find enclosing StateOrProvince for nameListES tag ");
		}
		return SKIP_BODY;
	}
}

