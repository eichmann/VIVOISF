package edu.uiowa.slis.VIVOISF.StateOrProvince;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StateOrProvinceAgriculturalAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StateOrProvinceAgriculturalAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(StateOrProvinceAgriculturalAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StateOrProvinceAgriculturalAreaUnitIterator theStateOrProvince = (StateOrProvinceAgriculturalAreaUnitIterator)findAncestorWithClass(this, StateOrProvinceAgriculturalAreaUnitIterator.class);
			pageContext.getOut().print(theStateOrProvince.getAgriculturalAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing StateOrProvince for agriculturalAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing StateOrProvince for agriculturalAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

