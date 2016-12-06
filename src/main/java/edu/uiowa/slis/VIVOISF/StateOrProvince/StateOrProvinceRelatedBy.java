package edu.uiowa.slis.VIVOISF.StateOrProvince;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StateOrProvinceRelatedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StateOrProvinceRelatedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(StateOrProvinceRelatedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StateOrProvinceRelatedByIterator theStateOrProvinceRelatedByIterator = (StateOrProvinceRelatedByIterator)findAncestorWithClass(this, StateOrProvinceRelatedByIterator.class);
			pageContext.getOut().print(theStateOrProvinceRelatedByIterator.getRelatedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing StateOrProvince for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing StateOrProvince for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

