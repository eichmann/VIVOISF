package edu.uiowa.slis.VIVOISF.Position;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PositionPublicationVenueForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PositionPublicationVenueForType currentInstance = null;
	private static final Log log = LogFactory.getLog(PositionPublicationVenueForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PositionPublicationVenueForIterator thePositionPublicationVenueForIterator = (PositionPublicationVenueForIterator)findAncestorWithClass(this, PositionPublicationVenueForIterator.class);
			pageContext.getOut().print(thePositionPublicationVenueForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Position for publicationVenueFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Position for publicationVenueFor tag ");
		}
		return SKIP_BODY;
	}
}
