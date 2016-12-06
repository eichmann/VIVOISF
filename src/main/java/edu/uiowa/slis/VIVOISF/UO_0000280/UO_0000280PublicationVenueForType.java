package edu.uiowa.slis.VIVOISF.UO_0000280;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UO_0000280PublicationVenueForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static UO_0000280PublicationVenueForType currentInstance = null;
	private static final Log log = LogFactory.getLog(UO_0000280PublicationVenueForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			UO_0000280PublicationVenueForIterator theUO_0000280PublicationVenueForIterator = (UO_0000280PublicationVenueForIterator)findAncestorWithClass(this, UO_0000280PublicationVenueForIterator.class);
			pageContext.getOut().print(theUO_0000280PublicationVenueForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing UO_0000280 for publicationVenueFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing UO_0000280 for publicationVenueFor tag ");
		}
		return SKIP_BODY;
	}
}

