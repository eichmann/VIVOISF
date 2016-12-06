package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherCountryAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherCountryAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherCountryAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PublisherCountryAreaTotalIterator thePublisher = (PublisherCountryAreaTotalIterator)findAncestorWithClass(this, PublisherCountryAreaTotalIterator.class);
			pageContext.getOut().print(thePublisher.getCountryAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for countryAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for countryAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

