package edu.uiowa.slis.VIVOISF.Country;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountryRO_0000053Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountryRO_0000053Type currentInstance = null;
	private static final Log log = LogFactory.getLog(CountryRO_0000053Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CountryRO_0000053Iterator theCountryRO_0000053Iterator = (CountryRO_0000053Iterator)findAncestorWithClass(this, CountryRO_0000053Iterator.class);
			pageContext.getOut().print(theCountryRO_0000053Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Country for RO_0000053 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for RO_0000053 tag ");
		}
		return SKIP_BODY;
	}
}

