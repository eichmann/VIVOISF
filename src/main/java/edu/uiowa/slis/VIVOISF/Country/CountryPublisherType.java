package edu.uiowa.slis.VIVOISF.Country;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountryPublisherType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountryPublisherType currentInstance = null;
	private static final Log log = LogFactory.getLog(CountryPublisherType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CountryPublisherIterator theCountryPublisherIterator = (CountryPublisherIterator)findAncestorWithClass(this, CountryPublisherIterator.class);
			pageContext.getOut().print(theCountryPublisherIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Country for publisher tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for publisher tag ");
		}
		return SKIP_BODY;
	}
}

