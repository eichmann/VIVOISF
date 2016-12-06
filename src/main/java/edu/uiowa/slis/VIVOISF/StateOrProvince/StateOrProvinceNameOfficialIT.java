package edu.uiowa.slis.VIVOISF.StateOrProvince;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StateOrProvinceNameOfficialIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StateOrProvinceNameOfficialIT currentInstance = null;
	private static final Log log = LogFactory.getLog(StateOrProvinceNameOfficialIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StateOrProvinceNameOfficialITIterator theStateOrProvince = (StateOrProvinceNameOfficialITIterator)findAncestorWithClass(this, StateOrProvinceNameOfficialITIterator.class);
			pageContext.getOut().print(theStateOrProvince.getNameOfficialIT());
		} catch (Exception e) {
			log.error("Can't find enclosing StateOrProvince for nameOfficialIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing StateOrProvince for nameOfficialIT tag ");
		}
		return SKIP_BODY;
	}
}

