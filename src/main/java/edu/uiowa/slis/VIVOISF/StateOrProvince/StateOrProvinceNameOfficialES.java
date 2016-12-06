package edu.uiowa.slis.VIVOISF.StateOrProvince;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StateOrProvinceNameOfficialES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StateOrProvinceNameOfficialES currentInstance = null;
	private static final Log log = LogFactory.getLog(StateOrProvinceNameOfficialES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StateOrProvinceNameOfficialESIterator theStateOrProvince = (StateOrProvinceNameOfficialESIterator)findAncestorWithClass(this, StateOrProvinceNameOfficialESIterator.class);
			pageContext.getOut().print(theStateOrProvince.getNameOfficialES());
		} catch (Exception e) {
			log.error("Can't find enclosing StateOrProvince for nameOfficialES tag ", e);
			throw new JspTagException("Error: Can't find enclosing StateOrProvince for nameOfficialES tag ");
		}
		return SKIP_BODY;
	}
}

