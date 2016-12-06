package edu.uiowa.slis.VIVOISF.StateOrProvince;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StateOrProvinceNameOfficialAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StateOrProvinceNameOfficialAR currentInstance = null;
	private static final Log log = LogFactory.getLog(StateOrProvinceNameOfficialAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StateOrProvinceNameOfficialARIterator theStateOrProvince = (StateOrProvinceNameOfficialARIterator)findAncestorWithClass(this, StateOrProvinceNameOfficialARIterator.class);
			pageContext.getOut().print(theStateOrProvince.getNameOfficialAR());
		} catch (Exception e) {
			log.error("Can't find enclosing StateOrProvince for nameOfficialAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing StateOrProvince for nameOfficialAR tag ");
		}
		return SKIP_BODY;
	}
}

