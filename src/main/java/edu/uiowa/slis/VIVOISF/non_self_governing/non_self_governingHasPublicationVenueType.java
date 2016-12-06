package edu.uiowa.slis.VIVOISF.non_self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class non_self_governingHasPublicationVenueType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static non_self_governingHasPublicationVenueType currentInstance = null;
	private static final Log log = LogFactory.getLog(non_self_governingHasPublicationVenueType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			non_self_governingHasPublicationVenueIterator thenon_self_governingHasPublicationVenueIterator = (non_self_governingHasPublicationVenueIterator)findAncestorWithClass(this, non_self_governingHasPublicationVenueIterator.class);
			pageContext.getOut().print(thenon_self_governingHasPublicationVenueIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing non_self_governing for hasPublicationVenue tag ", e);
			throw new JspTagException("Error: Can't find enclosing non_self_governing for hasPublicationVenue tag ");
		}
		return SKIP_BODY;
	}
}

