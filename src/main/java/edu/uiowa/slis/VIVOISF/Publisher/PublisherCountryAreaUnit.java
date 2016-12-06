package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherCountryAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherCountryAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherCountryAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PublisherCountryAreaUnitIterator thePublisher = (PublisherCountryAreaUnitIterator)findAncestorWithClass(this, PublisherCountryAreaUnitIterator.class);
			pageContext.getOut().print(thePublisher.getCountryAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for countryAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for countryAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

