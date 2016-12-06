package edu.uiowa.slis.VIVOISF.Position;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PositionHasPublicationVenueType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PositionHasPublicationVenueType currentInstance = null;
	private static final Log log = LogFactory.getLog(PositionHasPublicationVenueType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PositionHasPublicationVenueIterator thePositionHasPublicationVenueIterator = (PositionHasPublicationVenueIterator)findAncestorWithClass(this, PositionHasPublicationVenueIterator.class);
			pageContext.getOut().print(thePositionHasPublicationVenueIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Position for hasPublicationVenue tag ", e);
			throw new JspTagException("Error: Can't find enclosing Position for hasPublicationVenue tag ");
		}
		return SKIP_BODY;
	}
}

