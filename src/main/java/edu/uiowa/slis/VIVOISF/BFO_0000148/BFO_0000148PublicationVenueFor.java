package edu.uiowa.slis.VIVOISF.BFO_0000148;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000148PublicationVenueFor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000148PublicationVenueFor currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000148PublicationVenueFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BFO_0000148PublicationVenueForIterator theBFO_0000148PublicationVenueForIterator = (BFO_0000148PublicationVenueForIterator)findAncestorWithClass(this, BFO_0000148PublicationVenueForIterator.class);
			pageContext.getOut().print(theBFO_0000148PublicationVenueForIterator.getPublicationVenueFor());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000148 for publicationVenueFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000148 for publicationVenueFor tag ");
		}
		return SKIP_BODY;
	}
}

