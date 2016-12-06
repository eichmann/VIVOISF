package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryCountryAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryCountryAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryCountryAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			territoryCountryAreaTotalIterator theterritory = (territoryCountryAreaTotalIterator)findAncestorWithClass(this, territoryCountryAreaTotalIterator.class);
			pageContext.getOut().print(theterritory.getCountryAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for countryAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for countryAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

