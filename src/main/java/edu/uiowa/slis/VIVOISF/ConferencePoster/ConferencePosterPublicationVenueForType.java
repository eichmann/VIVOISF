package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterPublicationVenueForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterPublicationVenueForType currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterPublicationVenueForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterPublicationVenueForIterator theConferencePosterPublicationVenueForIterator = (ConferencePosterPublicationVenueForIterator)findAncestorWithClass(this, ConferencePosterPublicationVenueForIterator.class);
			pageContext.getOut().print(theConferencePosterPublicationVenueForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for publicationVenueFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for publicationVenueFor tag ");
		}
		return SKIP_BODY;
	}
}

