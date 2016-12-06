package edu.uiowa.slis.VIVOISF.StateOrProvince;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StateOrProvinceCodeISO3 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StateOrProvinceCodeISO3 currentInstance = null;
	private static final Log log = LogFactory.getLog(StateOrProvinceCodeISO3.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StateOrProvinceCodeISO3Iterator theStateOrProvince = (StateOrProvinceCodeISO3Iterator)findAncestorWithClass(this, StateOrProvinceCodeISO3Iterator.class);
			pageContext.getOut().print(theStateOrProvince.getCodeISO3());
		} catch (Exception e) {
			log.error("Can't find enclosing StateOrProvince for codeISO3 tag ", e);
			throw new JspTagException("Error: Can't find enclosing StateOrProvince for codeISO3 tag ");
		}
		return SKIP_BODY;
	}
}

