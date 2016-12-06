package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryCountryAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryCountryAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryCountryAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			territoryCountryAreaUnitIterator theterritory = (territoryCountryAreaUnitIterator)findAncestorWithClass(this, territoryCountryAreaUnitIterator.class);
			pageContext.getOut().print(theterritory.getCountryAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for countryAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for countryAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

