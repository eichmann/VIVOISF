package edu.uiowa.slis.VIVOISF.IAO_0000003;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000003PublicationVenueForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000003PublicationVenueForType currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000003PublicationVenueForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IAO_0000003PublicationVenueForIterator theIAO_0000003PublicationVenueForIterator = (IAO_0000003PublicationVenueForIterator)findAncestorWithClass(this, IAO_0000003PublicationVenueForIterator.class);
			pageContext.getOut().print(theIAO_0000003PublicationVenueForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000003 for publicationVenueFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000003 for publicationVenueFor tag ");
		}
		return SKIP_BODY;
	}
}

