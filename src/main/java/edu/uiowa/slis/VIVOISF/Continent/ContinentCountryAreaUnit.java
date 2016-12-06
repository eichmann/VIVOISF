package edu.uiowa.slis.VIVOISF.Continent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinentCountryAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContinentCountryAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinentCountryAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ContinentCountryAreaUnitIterator theContinent = (ContinentCountryAreaUnitIterator)findAncestorWithClass(this, ContinentCountryAreaUnitIterator.class);
			pageContext.getOut().print(theContinent.getCountryAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Continent for countryAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for countryAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

