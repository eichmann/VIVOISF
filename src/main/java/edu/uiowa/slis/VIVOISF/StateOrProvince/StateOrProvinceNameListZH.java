package edu.uiowa.slis.VIVOISF.StateOrProvince;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StateOrProvinceNameListZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StateOrProvinceNameListZH currentInstance = null;
	private static final Log log = LogFactory.getLog(StateOrProvinceNameListZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StateOrProvinceNameListZHIterator theStateOrProvince = (StateOrProvinceNameListZHIterator)findAncestorWithClass(this, StateOrProvinceNameListZHIterator.class);
			pageContext.getOut().print(theStateOrProvince.getNameListZH());
		} catch (Exception e) {
			log.error("Can't find enclosing StateOrProvince for nameListZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing StateOrProvince for nameListZH tag ");
		}
		return SKIP_BODY;
	}
}

