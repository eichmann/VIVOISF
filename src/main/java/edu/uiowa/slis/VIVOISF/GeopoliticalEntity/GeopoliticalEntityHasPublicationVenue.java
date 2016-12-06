package edu.uiowa.slis.VIVOISF.GeopoliticalEntity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeopoliticalEntityHasPublicationVenue extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeopoliticalEntityHasPublicationVenue currentInstance = null;
	private static final Log log = LogFactory.getLog(GeopoliticalEntityHasPublicationVenue.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GeopoliticalEntityHasPublicationVenueIterator theGeopoliticalEntityHasPublicationVenueIterator = (GeopoliticalEntityHasPublicationVenueIterator)findAncestorWithClass(this, GeopoliticalEntityHasPublicationVenueIterator.class);
			pageContext.getOut().print(theGeopoliticalEntityHasPublicationVenueIterator.getHasPublicationVenue());
		} catch (Exception e) {
			log.error("Can't find enclosing GeopoliticalEntity for hasPublicationVenue tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeopoliticalEntity for hasPublicationVenue tag ");
		}
		return SKIP_BODY;
	}
}

