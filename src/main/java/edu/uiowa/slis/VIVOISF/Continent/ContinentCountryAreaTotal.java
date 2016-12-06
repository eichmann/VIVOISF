package edu.uiowa.slis.VIVOISF.Continent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinentCountryAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContinentCountryAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinentCountryAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ContinentCountryAreaTotalIterator theContinent = (ContinentCountryAreaTotalIterator)findAncestorWithClass(this, ContinentCountryAreaTotalIterator.class);
			pageContext.getOut().print(theContinent.getCountryAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Continent for countryAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for countryAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

