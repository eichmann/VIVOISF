package edu.uiowa.slis.VIVOISF.Country;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountryDescription extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountryDescription currentInstance = null;
	private static final Log log = LogFactory.getLog(CountryDescription.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CountryDescriptionIterator theCountry = (CountryDescriptionIterator)findAncestorWithClass(this, CountryDescriptionIterator.class);
			pageContext.getOut().print(theCountry.getDescription());
		} catch (Exception e) {
			log.error("Can't find enclosing Country for description tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for description tag ");
		}
		return SKIP_BODY;
	}
}

