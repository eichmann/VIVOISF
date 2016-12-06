package edu.uiowa.slis.VIVOISF.StateOrProvince;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StateOrProvinceNameListRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StateOrProvinceNameListRU currentInstance = null;
	private static final Log log = LogFactory.getLog(StateOrProvinceNameListRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StateOrProvinceNameListRUIterator theStateOrProvince = (StateOrProvinceNameListRUIterator)findAncestorWithClass(this, StateOrProvinceNameListRUIterator.class);
			pageContext.getOut().print(theStateOrProvince.getNameListRU());
		} catch (Exception e) {
			log.error("Can't find enclosing StateOrProvince for nameListRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing StateOrProvince for nameListRU tag ");
		}
		return SKIP_BODY;
	}
}

