package edu.uiowa.slis.VIVOISF.Country;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountryIsAdministeredByInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountryIsAdministeredByInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(CountryIsAdministeredByInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CountryIsAdministeredByInverseIterator theCountryIsAdministeredByInverseIterator = (CountryIsAdministeredByInverseIterator)findAncestorWithClass(this, CountryIsAdministeredByInverseIterator.class);
			pageContext.getOut().print(theCountryIsAdministeredByInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Country for isAdministeredBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for isAdministeredBy tag ");
		}
		return SKIP_BODY;
	}
}

