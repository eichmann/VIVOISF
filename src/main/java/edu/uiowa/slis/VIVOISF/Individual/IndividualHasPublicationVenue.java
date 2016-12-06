package edu.uiowa.slis.VIVOISF.Individual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndividualHasPublicationVenue extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IndividualHasPublicationVenue currentInstance = null;
	private static final Log log = LogFactory.getLog(IndividualHasPublicationVenue.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IndividualHasPublicationVenueIterator theIndividualHasPublicationVenueIterator = (IndividualHasPublicationVenueIterator)findAncestorWithClass(this, IndividualHasPublicationVenueIterator.class);
			pageContext.getOut().print(theIndividualHasPublicationVenueIterator.getHasPublicationVenue());
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for hasPublicationVenue tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for hasPublicationVenue tag ");
		}
		return SKIP_BODY;
	}
}

