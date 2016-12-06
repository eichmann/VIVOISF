package edu.uiowa.slis.VIVOISF.StateOrProvince;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StateOrProvinceCodeUN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StateOrProvinceCodeUN currentInstance = null;
	private static final Log log = LogFactory.getLog(StateOrProvinceCodeUN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StateOrProvinceCodeUNIterator theStateOrProvince = (StateOrProvinceCodeUNIterator)findAncestorWithClass(this, StateOrProvinceCodeUNIterator.class);
			pageContext.getOut().print(theStateOrProvince.getCodeUN());
		} catch (Exception e) {
			log.error("Can't find enclosing StateOrProvince for codeUN tag ", e);
			throw new JspTagException("Error: Can't find enclosing StateOrProvince for codeUN tag ");
		}
		return SKIP_BODY;
	}
}

