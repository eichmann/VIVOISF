package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaHasPublicationVenue extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaHasPublicationVenue currentInstance = null;
	private static final Log log = LogFactory.getLog(areaHasPublicationVenue.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			areaHasPublicationVenueIterator theareaHasPublicationVenueIterator = (areaHasPublicationVenueIterator)findAncestorWithClass(this, areaHasPublicationVenueIterator.class);
			pageContext.getOut().print(theareaHasPublicationVenueIterator.getHasPublicationVenue());
		} catch (Exception e) {
			log.error("Can't find enclosing area for hasPublicationVenue tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for hasPublicationVenue tag ");
		}
		return SKIP_BODY;
	}
}

