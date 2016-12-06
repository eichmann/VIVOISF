package edu.uiowa.slis.VIVOISF.UO_0000280;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UO_0000280HasPublicationVenueType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static UO_0000280HasPublicationVenueType currentInstance = null;
	private static final Log log = LogFactory.getLog(UO_0000280HasPublicationVenueType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			UO_0000280HasPublicationVenueIterator theUO_0000280HasPublicationVenueIterator = (UO_0000280HasPublicationVenueIterator)findAncestorWithClass(this, UO_0000280HasPublicationVenueIterator.class);
			pageContext.getOut().print(theUO_0000280HasPublicationVenueIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing UO_0000280 for hasPublicationVenue tag ", e);
			throw new JspTagException("Error: Can't find enclosing UO_0000280 for hasPublicationVenue tag ");
		}
		return SKIP_BODY;
	}
}

