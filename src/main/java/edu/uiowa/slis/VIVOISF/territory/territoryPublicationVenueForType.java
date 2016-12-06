package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryPublicationVenueForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryPublicationVenueForType currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryPublicationVenueForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			territoryPublicationVenueForIterator theterritoryPublicationVenueForIterator = (territoryPublicationVenueForIterator)findAncestorWithClass(this, territoryPublicationVenueForIterator.class);
			pageContext.getOut().print(theterritoryPublicationVenueForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for publicationVenueFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for publicationVenueFor tag ");
		}
		return SKIP_BODY;
	}
}

