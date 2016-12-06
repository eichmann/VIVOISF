package edu.uiowa.slis.VIVOISF.StateOrProvince;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StateOrProvinceCodeFAOTERM extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StateOrProvinceCodeFAOTERM currentInstance = null;
	private static final Log log = LogFactory.getLog(StateOrProvinceCodeFAOTERM.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StateOrProvinceCodeFAOTERMIterator theStateOrProvince = (StateOrProvinceCodeFAOTERMIterator)findAncestorWithClass(this, StateOrProvinceCodeFAOTERMIterator.class);
			pageContext.getOut().print(theStateOrProvince.getCodeFAOTERM());
		} catch (Exception e) {
			log.error("Can't find enclosing StateOrProvince for codeFAOTERM tag ", e);
			throw new JspTagException("Error: Can't find enclosing StateOrProvince for codeFAOTERM tag ");
		}
		return SKIP_BODY;
	}
}

