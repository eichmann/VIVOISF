package edu.uiowa.slis.VIVOISF.BFO_0000001;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000001PublicationVenueForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000001PublicationVenueForType currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000001PublicationVenueForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BFO_0000001PublicationVenueForIterator theBFO_0000001PublicationVenueForIterator = (BFO_0000001PublicationVenueForIterator)findAncestorWithClass(this, BFO_0000001PublicationVenueForIterator.class);
			pageContext.getOut().print(theBFO_0000001PublicationVenueForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000001 for publicationVenueFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000001 for publicationVenueFor tag ");
		}
		return SKIP_BODY;
	}
}

