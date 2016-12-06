package edu.uiowa.slis.VIVOISF.StateOrProvince;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StateOrProvinceNameShortRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StateOrProvinceNameShortRU currentInstance = null;
	private static final Log log = LogFactory.getLog(StateOrProvinceNameShortRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StateOrProvinceNameShortRUIterator theStateOrProvince = (StateOrProvinceNameShortRUIterator)findAncestorWithClass(this, StateOrProvinceNameShortRUIterator.class);
			pageContext.getOut().print(theStateOrProvince.getNameShortRU());
		} catch (Exception e) {
			log.error("Can't find enclosing StateOrProvince for nameShortRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing StateOrProvince for nameShortRU tag ");
		}
		return SKIP_BODY;
	}
}

