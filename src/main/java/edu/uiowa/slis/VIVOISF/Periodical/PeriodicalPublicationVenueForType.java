package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalPublicationVenueForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalPublicationVenueForType currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalPublicationVenueForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalPublicationVenueForIterator thePeriodicalPublicationVenueForIterator = (PeriodicalPublicationVenueForIterator)findAncestorWithClass(this, PeriodicalPublicationVenueForIterator.class);
			pageContext.getOut().print(thePeriodicalPublicationVenueForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for publicationVenueFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for publicationVenueFor tag ");
		}
		return SKIP_BODY;
	}
}

