package edu.uiowa.slis.VIVOISF.PostdocPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocPositionHasPublicationVenue extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocPositionHasPublicationVenue currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocPositionHasPublicationVenue.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PostdocPositionHasPublicationVenueIterator thePostdocPositionHasPublicationVenueIterator = (PostdocPositionHasPublicationVenueIterator)findAncestorWithClass(this, PostdocPositionHasPublicationVenueIterator.class);
			pageContext.getOut().print(thePostdocPositionHasPublicationVenueIterator.getHasPublicationVenue());
		} catch (Exception e) {
			log.error("Can't find enclosing PostdocPosition for hasPublicationVenue tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdocPosition for hasPublicationVenue tag ");
		}
		return SKIP_BODY;
	}
}

