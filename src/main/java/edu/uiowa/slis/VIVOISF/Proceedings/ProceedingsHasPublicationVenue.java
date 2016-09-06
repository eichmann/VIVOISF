package edu.uiowa.slis.VIVOISF.Proceedings;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProceedingsHasPublicationVenue extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ProceedingsHasPublicationVenue currentInstance = null;
	private static final Log log = LogFactory.getLog(ProceedingsHasPublicationVenue.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ProceedingsHasPublicationVenueIterator theProceedingsHasPublicationVenueIterator = (ProceedingsHasPublicationVenueIterator)findAncestorWithClass(this, ProceedingsHasPublicationVenueIterator.class);
			pageContext.getOut().print(theProceedingsHasPublicationVenueIterator.getHasPublicationVenue());
		} catch (Exception e) {
			log.error("Can't find enclosing Proceedings for hasPublicationVenue tag ", e);
			throw new JspTagException("Error: Can't find enclosing Proceedings for hasPublicationVenue tag ");
		}
		return SKIP_BODY;
	}
}

