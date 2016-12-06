package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionHasPublicationVenue extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionHasPublicationVenue currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionHasPublicationVenue.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			economic_regionHasPublicationVenueIterator theeconomic_regionHasPublicationVenueIterator = (economic_regionHasPublicationVenueIterator)findAncestorWithClass(this, economic_regionHasPublicationVenueIterator.class);
			pageContext.getOut().print(theeconomic_regionHasPublicationVenueIterator.getHasPublicationVenue());
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for hasPublicationVenue tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for hasPublicationVenue tag ");
		}
		return SKIP_BODY;
	}
}

