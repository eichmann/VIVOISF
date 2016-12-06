package edu.uiowa.slis.VIVOISF.IAO_0000003;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000003CountryAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000003CountryAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000003CountryAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IAO_0000003CountryAreaYearIterator theIAO_0000003 = (IAO_0000003CountryAreaYearIterator)findAncestorWithClass(this, IAO_0000003CountryAreaYearIterator.class);
			pageContext.getOut().print(theIAO_0000003.getCountryAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000003 for countryAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000003 for countryAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

