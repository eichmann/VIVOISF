package edu.uiowa.slis.VIVOISF.Country;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountryARG_2000028Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountryARG_2000028Type currentInstance = null;
	private static final Log log = LogFactory.getLog(CountryARG_2000028Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CountryARG_2000028Iterator theCountryARG_2000028Iterator = (CountryARG_2000028Iterator)findAncestorWithClass(this, CountryARG_2000028Iterator.class);
			pageContext.getOut().print(theCountryARG_2000028Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Country for ARG_2000028 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for ARG_2000028 tag ");
		}
		return SKIP_BODY;
	}
}

