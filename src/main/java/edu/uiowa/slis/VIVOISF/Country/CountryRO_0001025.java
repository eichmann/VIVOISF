package edu.uiowa.slis.VIVOISF.Country;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountryRO_0001025 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountryRO_0001025 currentInstance = null;
	private static final Log log = LogFactory.getLog(CountryRO_0001025.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CountryRO_0001025Iterator theCountryRO_0001025Iterator = (CountryRO_0001025Iterator)findAncestorWithClass(this, CountryRO_0001025Iterator.class);
			pageContext.getOut().print(theCountryRO_0001025Iterator.getRO_0001025());
		} catch (Exception e) {
			log.error("Can't find enclosing Country for RO_0001025 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for RO_0001025 tag ");
		}
		return SKIP_BODY;
	}
}

