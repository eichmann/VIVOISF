package edu.uiowa.slis.VIVOISF.Country;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountryRO_0001015Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountryRO_0001015Type currentInstance = null;
	private static final Log log = LogFactory.getLog(CountryRO_0001015Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CountryRO_0001015Iterator theCountryRO_0001015Iterator = (CountryRO_0001015Iterator)findAncestorWithClass(this, CountryRO_0001015Iterator.class);
			pageContext.getOut().print(theCountryRO_0001015Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Country for RO_0001015 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for RO_0001015 tag ");
		}
		return SKIP_BODY;
	}
}

