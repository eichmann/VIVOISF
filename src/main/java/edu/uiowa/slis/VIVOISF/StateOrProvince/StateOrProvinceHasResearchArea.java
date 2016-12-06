package edu.uiowa.slis.VIVOISF.StateOrProvince;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StateOrProvinceHasResearchArea extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StateOrProvinceHasResearchArea currentInstance = null;
	private static final Log log = LogFactory.getLog(StateOrProvinceHasResearchArea.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StateOrProvinceHasResearchAreaIterator theStateOrProvinceHasResearchAreaIterator = (StateOrProvinceHasResearchAreaIterator)findAncestorWithClass(this, StateOrProvinceHasResearchAreaIterator.class);
			pageContext.getOut().print(theStateOrProvinceHasResearchAreaIterator.getHasResearchArea());
		} catch (Exception e) {
			log.error("Can't find enclosing StateOrProvince for hasResearchArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing StateOrProvince for hasResearchArea tag ");
		}
		return SKIP_BODY;
	}
}

