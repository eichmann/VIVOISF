package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryCountryAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryCountryAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryCountryAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			territoryCountryAreaYearIterator theterritory = (territoryCountryAreaYearIterator)findAncestorWithClass(this, territoryCountryAreaYearIterator.class);
			pageContext.getOut().print(theterritory.getCountryAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for countryAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for countryAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

