package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalPublicationVenueFor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalPublicationVenueFor currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalPublicationVenueFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalPublicationVenueForIterator thePeriodicalPublicationVenueForIterator = (PeriodicalPublicationVenueForIterator)findAncestorWithClass(this, PeriodicalPublicationVenueForIterator.class);
			pageContext.getOut().print(thePeriodicalPublicationVenueForIterator.getPublicationVenueFor());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for publicationVenueFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for publicationVenueFor tag ");
		}
		return SKIP_BODY;
	}
}

