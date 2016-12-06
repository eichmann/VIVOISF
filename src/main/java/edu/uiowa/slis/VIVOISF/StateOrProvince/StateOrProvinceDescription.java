package edu.uiowa.slis.VIVOISF.StateOrProvince;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StateOrProvinceDescription extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StateOrProvinceDescription currentInstance = null;
	private static final Log log = LogFactory.getLog(StateOrProvinceDescription.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StateOrProvinceDescriptionIterator theStateOrProvince = (StateOrProvinceDescriptionIterator)findAncestorWithClass(this, StateOrProvinceDescriptionIterator.class);
			pageContext.getOut().print(theStateOrProvince.getDescription());
		} catch (Exception e) {
			log.error("Can't find enclosing StateOrProvince for description tag ", e);
			throw new JspTagException("Error: Can't find enclosing StateOrProvince for description tag ");
		}
		return SKIP_BODY;
	}
}

