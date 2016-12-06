package edu.uiowa.slis.VIVOISF.Individual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndividualHasPublicationVenueType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IndividualHasPublicationVenueType currentInstance = null;
	private static final Log log = LogFactory.getLog(IndividualHasPublicationVenueType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IndividualHasPublicationVenueIterator theIndividualHasPublicationVenueIterator = (IndividualHasPublicationVenueIterator)findAncestorWithClass(this, IndividualHasPublicationVenueIterator.class);
			pageContext.getOut().print(theIndividualHasPublicationVenueIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for hasPublicationVenue tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for hasPublicationVenue tag ");
		}
		return SKIP_BODY;
	}
}

