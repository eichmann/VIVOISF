package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingHasPublicationVenue extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingHasPublicationVenue currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingHasPublicationVenue.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			self_governingHasPublicationVenueIterator theself_governingHasPublicationVenueIterator = (self_governingHasPublicationVenueIterator)findAncestorWithClass(this, self_governingHasPublicationVenueIterator.class);
			pageContext.getOut().print(theself_governingHasPublicationVenueIterator.getHasPublicationVenue());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for hasPublicationVenue tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for hasPublicationVenue tag ");
		}
		return SKIP_BODY;
	}
}

