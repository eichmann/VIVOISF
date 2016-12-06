package edu.uiowa.slis.VIVOISF.StateOrProvince;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StateOrProvinceCodeGAUL extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StateOrProvinceCodeGAUL currentInstance = null;
	private static final Log log = LogFactory.getLog(StateOrProvinceCodeGAUL.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StateOrProvinceCodeGAULIterator theStateOrProvince = (StateOrProvinceCodeGAULIterator)findAncestorWithClass(this, StateOrProvinceCodeGAULIterator.class);
			pageContext.getOut().print(theStateOrProvince.getCodeGAUL());
		} catch (Exception e) {
			log.error("Can't find enclosing StateOrProvince for codeGAUL tag ", e);
			throw new JspTagException("Error: Can't find enclosing StateOrProvince for codeGAUL tag ");
		}
		return SKIP_BODY;
	}
}

