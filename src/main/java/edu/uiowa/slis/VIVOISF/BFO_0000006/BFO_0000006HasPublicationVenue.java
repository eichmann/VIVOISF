package edu.uiowa.slis.VIVOISF.BFO_0000006;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000006HasPublicationVenue extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000006HasPublicationVenue currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000006HasPublicationVenue.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BFO_0000006HasPublicationVenueIterator theBFO_0000006HasPublicationVenueIterator = (BFO_0000006HasPublicationVenueIterator)findAncestorWithClass(this, BFO_0000006HasPublicationVenueIterator.class);
			pageContext.getOut().print(theBFO_0000006HasPublicationVenueIterator.getHasPublicationVenue());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000006 for hasPublicationVenue tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000006 for hasPublicationVenue tag ");
		}
		return SKIP_BODY;
	}
}

