package edu.uiowa.slis.VIVOISF.StateOrProvince;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StateOrProvinceNameOfficialZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StateOrProvinceNameOfficialZH currentInstance = null;
	private static final Log log = LogFactory.getLog(StateOrProvinceNameOfficialZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StateOrProvinceNameOfficialZHIterator theStateOrProvince = (StateOrProvinceNameOfficialZHIterator)findAncestorWithClass(this, StateOrProvinceNameOfficialZHIterator.class);
			pageContext.getOut().print(theStateOrProvince.getNameOfficialZH());
		} catch (Exception e) {
			log.error("Can't find enclosing StateOrProvince for nameOfficialZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing StateOrProvince for nameOfficialZH tag ");
		}
		return SKIP_BODY;
	}
}

