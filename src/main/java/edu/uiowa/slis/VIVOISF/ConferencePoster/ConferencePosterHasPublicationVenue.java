package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterHasPublicationVenue extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterHasPublicationVenue currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterHasPublicationVenue.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterHasPublicationVenueIterator theConferencePosterHasPublicationVenueIterator = (ConferencePosterHasPublicationVenueIterator)findAncestorWithClass(this, ConferencePosterHasPublicationVenueIterator.class);
			pageContext.getOut().print(theConferencePosterHasPublicationVenueIterator.getHasPublicationVenue());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for hasPublicationVenue tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for hasPublicationVenue tag ");
		}
		return SKIP_BODY;
	}
}

