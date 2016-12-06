package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryHasPublicationVenueType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryHasPublicationVenueType currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryHasPublicationVenueType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			territoryHasPublicationVenueIterator theterritoryHasPublicationVenueIterator = (territoryHasPublicationVenueIterator)findAncestorWithClass(this, territoryHasPublicationVenueIterator.class);
			pageContext.getOut().print(theterritoryHasPublicationVenueIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for hasPublicationVenue tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for hasPublicationVenue tag ");
		}
		return SKIP_BODY;
	}
}

