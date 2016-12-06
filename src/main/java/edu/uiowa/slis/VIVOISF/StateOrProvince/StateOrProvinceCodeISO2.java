package edu.uiowa.slis.VIVOISF.StateOrProvince;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StateOrProvinceCodeISO2 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StateOrProvinceCodeISO2 currentInstance = null;
	private static final Log log = LogFactory.getLog(StateOrProvinceCodeISO2.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StateOrProvinceCodeISO2Iterator theStateOrProvince = (StateOrProvinceCodeISO2Iterator)findAncestorWithClass(this, StateOrProvinceCodeISO2Iterator.class);
			pageContext.getOut().print(theStateOrProvince.getCodeISO2());
		} catch (Exception e) {
			log.error("Can't find enclosing StateOrProvince for codeISO2 tag ", e);
			throw new JspTagException("Error: Can't find enclosing StateOrProvince for codeISO2 tag ");
		}
		return SKIP_BODY;
	}
}

