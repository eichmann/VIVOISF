package edu.uiowa.slis.VIVOISF.PrimaryPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrimaryPositionPublicationVenueForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrimaryPositionPublicationVenueForType currentInstance = null;
	private static final Log log = LogFactory.getLog(PrimaryPositionPublicationVenueForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PrimaryPositionPublicationVenueForIterator thePrimaryPositionPublicationVenueForIterator = (PrimaryPositionPublicationVenueForIterator)findAncestorWithClass(this, PrimaryPositionPublicationVenueForIterator.class);
			pageContext.getOut().print(thePrimaryPositionPublicationVenueForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PrimaryPosition for publicationVenueFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrimaryPosition for publicationVenueFor tag ");
		}
		return SKIP_BODY;
	}
}

