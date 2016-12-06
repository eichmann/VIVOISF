package edu.uiowa.slis.VIVOISF.Country;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountryRelatedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountryRelatedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(CountryRelatedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CountryRelatedByIterator theCountryRelatedByIterator = (CountryRelatedByIterator)findAncestorWithClass(this, CountryRelatedByIterator.class);
			pageContext.getOut().print(theCountryRelatedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Country for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

