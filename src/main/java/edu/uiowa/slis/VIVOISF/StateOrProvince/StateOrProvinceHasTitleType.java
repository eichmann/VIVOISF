package edu.uiowa.slis.VIVOISF.StateOrProvince;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StateOrProvinceHasTitleType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StateOrProvinceHasTitleType currentInstance = null;
	private static final Log log = LogFactory.getLog(StateOrProvinceHasTitleType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StateOrProvinceHasTitleIterator theStateOrProvinceHasTitleIterator = (StateOrProvinceHasTitleIterator)findAncestorWithClass(this, StateOrProvinceHasTitleIterator.class);
			pageContext.getOut().print(theStateOrProvinceHasTitleIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing StateOrProvince for hasTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing StateOrProvince for hasTitle tag ");
		}
		return SKIP_BODY;
	}
}

