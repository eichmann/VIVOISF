package edu.uiowa.slis.VIVOISF.PrimaryPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrimaryPositionHasPublicationVenue extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrimaryPositionHasPublicationVenue currentInstance = null;
	private static final Log log = LogFactory.getLog(PrimaryPositionHasPublicationVenue.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PrimaryPositionHasPublicationVenueIterator thePrimaryPositionHasPublicationVenueIterator = (PrimaryPositionHasPublicationVenueIterator)findAncestorWithClass(this, PrimaryPositionHasPublicationVenueIterator.class);
			pageContext.getOut().print(thePrimaryPositionHasPublicationVenueIterator.getHasPublicationVenue());
		} catch (Exception e) {
			log.error("Can't find enclosing PrimaryPosition for hasPublicationVenue tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrimaryPosition for hasPublicationVenue tag ");
		}
		return SKIP_BODY;
	}
}

