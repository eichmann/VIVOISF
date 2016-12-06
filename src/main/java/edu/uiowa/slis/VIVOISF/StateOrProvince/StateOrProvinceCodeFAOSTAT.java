package edu.uiowa.slis.VIVOISF.StateOrProvince;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StateOrProvinceCodeFAOSTAT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StateOrProvinceCodeFAOSTAT currentInstance = null;
	private static final Log log = LogFactory.getLog(StateOrProvinceCodeFAOSTAT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StateOrProvinceCodeFAOSTATIterator theStateOrProvince = (StateOrProvinceCodeFAOSTATIterator)findAncestorWithClass(this, StateOrProvinceCodeFAOSTATIterator.class);
			pageContext.getOut().print(theStateOrProvince.getCodeFAOSTAT());
		} catch (Exception e) {
			log.error("Can't find enclosing StateOrProvince for codeFAOSTAT tag ", e);
			throw new JspTagException("Error: Can't find enclosing StateOrProvince for codeFAOSTAT tag ");
		}
		return SKIP_BODY;
	}
}

