package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingPublicationVenueForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingPublicationVenueForType currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingPublicationVenueForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			self_governingPublicationVenueForIterator theself_governingPublicationVenueForIterator = (self_governingPublicationVenueForIterator)findAncestorWithClass(this, self_governingPublicationVenueForIterator.class);
			pageContext.getOut().print(theself_governingPublicationVenueForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for publicationVenueFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for publicationVenueFor tag ");
		}
		return SKIP_BODY;
	}
}

