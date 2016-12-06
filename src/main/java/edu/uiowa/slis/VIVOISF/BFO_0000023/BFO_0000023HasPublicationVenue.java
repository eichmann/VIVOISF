package edu.uiowa.slis.VIVOISF.BFO_0000023;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000023HasPublicationVenue extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000023HasPublicationVenue currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000023HasPublicationVenue.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BFO_0000023HasPublicationVenueIterator theBFO_0000023HasPublicationVenueIterator = (BFO_0000023HasPublicationVenueIterator)findAncestorWithClass(this, BFO_0000023HasPublicationVenueIterator.class);
			pageContext.getOut().print(theBFO_0000023HasPublicationVenueIterator.getHasPublicationVenue());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000023 for hasPublicationVenue tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000023 for hasPublicationVenue tag ");
		}
		return SKIP_BODY;
	}
}

