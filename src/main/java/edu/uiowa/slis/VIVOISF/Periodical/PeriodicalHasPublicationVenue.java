package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalHasPublicationVenue extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalHasPublicationVenue currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalHasPublicationVenue.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalHasPublicationVenueIterator thePeriodicalHasPublicationVenueIterator = (PeriodicalHasPublicationVenueIterator)findAncestorWithClass(this, PeriodicalHasPublicationVenueIterator.class);
			pageContext.getOut().print(thePeriodicalHasPublicationVenueIterator.getHasPublicationVenue());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for hasPublicationVenue tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for hasPublicationVenue tag ");
		}
		return SKIP_BODY;
	}
}

