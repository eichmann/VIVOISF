package edu.uiowa.slis.VIVOISF.IAO_0000009;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000009PublicationVenueForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000009PublicationVenueForType currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000009PublicationVenueForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IAO_0000009PublicationVenueForIterator theIAO_0000009PublicationVenueForIterator = (IAO_0000009PublicationVenueForIterator)findAncestorWithClass(this, IAO_0000009PublicationVenueForIterator.class);
			pageContext.getOut().print(theIAO_0000009PublicationVenueForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000009 for publicationVenueFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000009 for publicationVenueFor tag ");
		}
		return SKIP_BODY;
	}
}

