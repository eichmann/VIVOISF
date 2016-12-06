package edu.uiowa.slis.VIVOISF.StateOrProvince;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StateOrProvinceHasResearchAreaType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StateOrProvinceHasResearchAreaType currentInstance = null;
	private static final Log log = LogFactory.getLog(StateOrProvinceHasResearchAreaType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StateOrProvinceHasResearchAreaIterator theStateOrProvinceHasResearchAreaIterator = (StateOrProvinceHasResearchAreaIterator)findAncestorWithClass(this, StateOrProvinceHasResearchAreaIterator.class);
			pageContext.getOut().print(theStateOrProvinceHasResearchAreaIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing StateOrProvince for hasResearchArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing StateOrProvince for hasResearchArea tag ");
		}
		return SKIP_BODY;
	}
}

