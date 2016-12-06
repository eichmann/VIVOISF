package edu.uiowa.slis.VIVOISF.BFO_0000003;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000003HasPublicationVenueType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000003HasPublicationVenueType currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000003HasPublicationVenueType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BFO_0000003HasPublicationVenueIterator theBFO_0000003HasPublicationVenueIterator = (BFO_0000003HasPublicationVenueIterator)findAncestorWithClass(this, BFO_0000003HasPublicationVenueIterator.class);
			pageContext.getOut().print(theBFO_0000003HasPublicationVenueIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000003 for hasPublicationVenue tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000003 for hasPublicationVenue tag ");
		}
		return SKIP_BODY;
	}
}
