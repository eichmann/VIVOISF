package edu.uiowa.slis.VIVOISF.BFO_0000038;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000038HasPublicationVenue extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000038HasPublicationVenue currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000038HasPublicationVenue.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BFO_0000038HasPublicationVenueIterator theBFO_0000038HasPublicationVenueIterator = (BFO_0000038HasPublicationVenueIterator)findAncestorWithClass(this, BFO_0000038HasPublicationVenueIterator.class);
			pageContext.getOut().print(theBFO_0000038HasPublicationVenueIterator.getHasPublicationVenue());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000038 for hasPublicationVenue tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000038 for hasPublicationVenue tag ");
		}
		return SKIP_BODY;
	}
}

