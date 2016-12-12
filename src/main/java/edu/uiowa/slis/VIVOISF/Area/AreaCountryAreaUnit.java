package edu.uiowa.slis.VIVOISF.Area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AreaCountryAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AreaCountryAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(AreaCountryAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AreaCountryAreaUnitIterator theArea = (AreaCountryAreaUnitIterator)findAncestorWithClass(this, AreaCountryAreaUnitIterator.class);
			pageContext.getOut().print(theArea.getCountryAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Area for countryAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Area for countryAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

