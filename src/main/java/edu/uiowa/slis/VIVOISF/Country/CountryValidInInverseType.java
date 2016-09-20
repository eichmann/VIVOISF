package edu.uiowa.slis.VIVOISF.Country;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountryValidInInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountryValidInInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(CountryValidInInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CountryValidInInverseIterator theCountryValidInInverseIterator = (CountryValidInInverseIterator)findAncestorWithClass(this, CountryValidInInverseIterator.class);
			pageContext.getOut().print(theCountryValidInInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Country for validIn tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for validIn tag ");
		}
		return SKIP_BODY;
	}
}

