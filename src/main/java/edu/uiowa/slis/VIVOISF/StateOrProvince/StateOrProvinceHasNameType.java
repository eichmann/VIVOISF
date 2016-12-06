package edu.uiowa.slis.VIVOISF.StateOrProvince;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StateOrProvinceHasNameType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StateOrProvinceHasNameType currentInstance = null;
	private static final Log log = LogFactory.getLog(StateOrProvinceHasNameType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StateOrProvinceHasNameIterator theStateOrProvinceHasNameIterator = (StateOrProvinceHasNameIterator)findAncestorWithClass(this, StateOrProvinceHasNameIterator.class);
			pageContext.getOut().print(theStateOrProvinceHasNameIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing StateOrProvince for hasName tag ", e);
			throw new JspTagException("Error: Can't find enclosing StateOrProvince for hasName tag ");
		}
		return SKIP_BODY;
	}
}

