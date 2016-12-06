package edu.uiowa.slis.VIVOISF.Country;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountryRO_0002234Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountryRO_0002234Type currentInstance = null;
	private static final Log log = LogFactory.getLog(CountryRO_0002234Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CountryRO_0002234Iterator theCountryRO_0002234Iterator = (CountryRO_0002234Iterator)findAncestorWithClass(this, CountryRO_0002234Iterator.class);
			pageContext.getOut().print(theCountryRO_0002234Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Country for RO_0002234 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for RO_0002234 tag ");
		}
		return SKIP_BODY;
	}
}

