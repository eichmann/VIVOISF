package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalHasPublicationVenueType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalHasPublicationVenueType currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalHasPublicationVenueType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalHasPublicationVenueIterator thePeriodicalHasPublicationVenueIterator = (PeriodicalHasPublicationVenueIterator)findAncestorWithClass(this, PeriodicalHasPublicationVenueIterator.class);
			pageContext.getOut().print(thePeriodicalHasPublicationVenueIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for hasPublicationVenue tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for hasPublicationVenue tag ");
		}
		return SKIP_BODY;
	}
}

