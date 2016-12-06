package edu.uiowa.slis.VIVOISF.StateOrProvince;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StateOrProvinceNameOfficialRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StateOrProvinceNameOfficialRU currentInstance = null;
	private static final Log log = LogFactory.getLog(StateOrProvinceNameOfficialRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StateOrProvinceNameOfficialRUIterator theStateOrProvince = (StateOrProvinceNameOfficialRUIterator)findAncestorWithClass(this, StateOrProvinceNameOfficialRUIterator.class);
			pageContext.getOut().print(theStateOrProvince.getNameOfficialRU());
		} catch (Exception e) {
			log.error("Can't find enclosing StateOrProvince for nameOfficialRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing StateOrProvince for nameOfficialRU tag ");
		}
		return SKIP_BODY;
	}
}

