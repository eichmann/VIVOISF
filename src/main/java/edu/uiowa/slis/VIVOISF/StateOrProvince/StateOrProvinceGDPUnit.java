package edu.uiowa.slis.VIVOISF.StateOrProvince;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StateOrProvinceGDPUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StateOrProvinceGDPUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(StateOrProvinceGDPUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StateOrProvinceGDPUnitIterator theStateOrProvince = (StateOrProvinceGDPUnitIterator)findAncestorWithClass(this, StateOrProvinceGDPUnitIterator.class);
			pageContext.getOut().print(theStateOrProvince.getGDPUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing StateOrProvince for GDPUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing StateOrProvince for GDPUnit tag ");
		}
		return SKIP_BODY;
	}
}

