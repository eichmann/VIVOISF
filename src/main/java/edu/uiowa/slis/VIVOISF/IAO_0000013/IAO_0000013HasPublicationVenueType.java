package edu.uiowa.slis.VIVOISF.IAO_0000013;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000013HasPublicationVenueType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000013HasPublicationVenueType currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000013HasPublicationVenueType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IAO_0000013HasPublicationVenueIterator theIAO_0000013HasPublicationVenueIterator = (IAO_0000013HasPublicationVenueIterator)findAncestorWithClass(this, IAO_0000013HasPublicationVenueIterator.class);
			pageContext.getOut().print(theIAO_0000013HasPublicationVenueIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000013 for hasPublicationVenue tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000013 for hasPublicationVenue tag ");
		}
		return SKIP_BODY;
	}
}

