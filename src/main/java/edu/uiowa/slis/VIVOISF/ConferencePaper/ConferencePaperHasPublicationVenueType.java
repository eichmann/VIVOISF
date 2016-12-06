package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperHasPublicationVenueType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperHasPublicationVenueType currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperHasPublicationVenueType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperHasPublicationVenueIterator theConferencePaperHasPublicationVenueIterator = (ConferencePaperHasPublicationVenueIterator)findAncestorWithClass(this, ConferencePaperHasPublicationVenueIterator.class);
			pageContext.getOut().print(theConferencePaperHasPublicationVenueIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for hasPublicationVenue tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for hasPublicationVenue tag ");
		}
		return SKIP_BODY;
	}
}

