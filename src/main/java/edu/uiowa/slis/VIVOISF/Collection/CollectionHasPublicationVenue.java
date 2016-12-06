package edu.uiowa.slis.VIVOISF.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionHasPublicationVenue extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectionHasPublicationVenue currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionHasPublicationVenue.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectionHasPublicationVenueIterator theCollectionHasPublicationVenueIterator = (CollectionHasPublicationVenueIterator)findAncestorWithClass(this, CollectionHasPublicationVenueIterator.class);
			pageContext.getOut().print(theCollectionHasPublicationVenueIterator.getHasPublicationVenue());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for hasPublicationVenue tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for hasPublicationVenue tag ");
		}
		return SKIP_BODY;
	}
}

