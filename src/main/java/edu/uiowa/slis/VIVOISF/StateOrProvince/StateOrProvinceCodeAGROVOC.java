package edu.uiowa.slis.VIVOISF.StateOrProvince;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StateOrProvinceCodeAGROVOC extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StateOrProvinceCodeAGROVOC currentInstance = null;
	private static final Log log = LogFactory.getLog(StateOrProvinceCodeAGROVOC.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StateOrProvinceCodeAGROVOCIterator theStateOrProvince = (StateOrProvinceCodeAGROVOCIterator)findAncestorWithClass(this, StateOrProvinceCodeAGROVOCIterator.class);
			pageContext.getOut().print(theStateOrProvince.getCodeAGROVOC());
		} catch (Exception e) {
			log.error("Can't find enclosing StateOrProvince for codeAGROVOC tag ", e);
			throw new JspTagException("Error: Can't find enclosing StateOrProvince for codeAGROVOC tag ");
		}
		return SKIP_BODY;
	}
}

