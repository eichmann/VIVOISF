package edu.uiowa.slis.VIVOISF.IAO_0000009;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000009HasPublicationVenue extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000009HasPublicationVenue currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000009HasPublicationVenue.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IAO_0000009HasPublicationVenueIterator theIAO_0000009HasPublicationVenueIterator = (IAO_0000009HasPublicationVenueIterator)findAncestorWithClass(this, IAO_0000009HasPublicationVenueIterator.class);
			pageContext.getOut().print(theIAO_0000009HasPublicationVenueIterator.getHasPublicationVenue());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000009 for hasPublicationVenue tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000009 for hasPublicationVenue tag ");
		}
		return SKIP_BODY;
	}
}

