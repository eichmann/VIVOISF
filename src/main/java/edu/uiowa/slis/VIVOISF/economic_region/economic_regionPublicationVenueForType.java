package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionPublicationVenueForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionPublicationVenueForType currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionPublicationVenueForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			economic_regionPublicationVenueForIterator theeconomic_regionPublicationVenueForIterator = (economic_regionPublicationVenueForIterator)findAncestorWithClass(this, economic_regionPublicationVenueForIterator.class);
			pageContext.getOut().print(theeconomic_regionPublicationVenueForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for publicationVenueFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for publicationVenueFor tag ");
		}
		return SKIP_BODY;
	}
}

