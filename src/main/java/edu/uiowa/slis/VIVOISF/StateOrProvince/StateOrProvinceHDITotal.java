package edu.uiowa.slis.VIVOISF.StateOrProvince;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StateOrProvinceHDITotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StateOrProvinceHDITotal currentInstance = null;
	private static final Log log = LogFactory.getLog(StateOrProvinceHDITotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StateOrProvinceHDITotalIterator theStateOrProvince = (StateOrProvinceHDITotalIterator)findAncestorWithClass(this, StateOrProvinceHDITotalIterator.class);
			pageContext.getOut().print(theStateOrProvince.getHDITotal());
		} catch (Exception e) {
			log.error("Can't find enclosing StateOrProvince for HDITotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing StateOrProvince for HDITotal tag ");
		}
		return SKIP_BODY;
	}
}

