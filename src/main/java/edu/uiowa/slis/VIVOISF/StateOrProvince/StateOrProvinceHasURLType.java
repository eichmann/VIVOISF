package edu.uiowa.slis.VIVOISF.StateOrProvince;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StateOrProvinceHasURLType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StateOrProvinceHasURLType currentInstance = null;
	private static final Log log = LogFactory.getLog(StateOrProvinceHasURLType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StateOrProvinceHasURLIterator theStateOrProvinceHasURLIterator = (StateOrProvinceHasURLIterator)findAncestorWithClass(this, StateOrProvinceHasURLIterator.class);
			pageContext.getOut().print(theStateOrProvinceHasURLIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing StateOrProvince for hasURL tag ", e);
			throw new JspTagException("Error: Can't find enclosing StateOrProvince for hasURL tag ");
		}
		return SKIP_BODY;
	}
}

