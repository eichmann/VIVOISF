package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherCountryAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherCountryAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherCountryAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PublisherCountryAreaYearIterator thePublisher = (PublisherCountryAreaYearIterator)findAncestorWithClass(this, PublisherCountryAreaYearIterator.class);
			pageContext.getOut().print(thePublisher.getCountryAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for countryAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for countryAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

