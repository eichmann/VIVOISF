package edu.uiowa.slis.VIVOISF.StateOrProvince;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StateOrProvinceCodeUNDP extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StateOrProvinceCodeUNDP currentInstance = null;
	private static final Log log = LogFactory.getLog(StateOrProvinceCodeUNDP.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StateOrProvinceCodeUNDPIterator theStateOrProvince = (StateOrProvinceCodeUNDPIterator)findAncestorWithClass(this, StateOrProvinceCodeUNDPIterator.class);
			pageContext.getOut().print(theStateOrProvince.getCodeUNDP());
		} catch (Exception e) {
			log.error("Can't find enclosing StateOrProvince for codeUNDP tag ", e);
			throw new JspTagException("Error: Can't find enclosing StateOrProvince for codeUNDP tag ");
		}
		return SKIP_BODY;
	}
}

