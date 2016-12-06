package edu.uiowa.slis.VIVOISF.StateOrProvince;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StateOrProvinceRelatedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StateOrProvinceRelatedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(StateOrProvinceRelatedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StateOrProvinceRelatedByIterator theStateOrProvinceRelatedByIterator = (StateOrProvinceRelatedByIterator)findAncestorWithClass(this, StateOrProvinceRelatedByIterator.class);
			pageContext.getOut().print(theStateOrProvinceRelatedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing StateOrProvince for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing StateOrProvince for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

