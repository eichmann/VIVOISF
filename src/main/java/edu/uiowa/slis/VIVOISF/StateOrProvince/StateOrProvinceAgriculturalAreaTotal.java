package edu.uiowa.slis.VIVOISF.StateOrProvince;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StateOrProvinceAgriculturalAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StateOrProvinceAgriculturalAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(StateOrProvinceAgriculturalAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StateOrProvinceAgriculturalAreaTotalIterator theStateOrProvince = (StateOrProvinceAgriculturalAreaTotalIterator)findAncestorWithClass(this, StateOrProvinceAgriculturalAreaTotalIterator.class);
			pageContext.getOut().print(theStateOrProvince.getAgriculturalAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing StateOrProvince for agriculturalAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing StateOrProvince for agriculturalAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

