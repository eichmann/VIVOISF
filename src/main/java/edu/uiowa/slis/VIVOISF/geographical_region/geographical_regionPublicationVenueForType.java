package edu.uiowa.slis.VIVOISF.geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class geographical_regionPublicationVenueForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static geographical_regionPublicationVenueForType currentInstance = null;
	private static final Log log = LogFactory.getLog(geographical_regionPublicationVenueForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			geographical_regionPublicationVenueForIterator thegeographical_regionPublicationVenueForIterator = (geographical_regionPublicationVenueForIterator)findAncestorWithClass(this, geographical_regionPublicationVenueForIterator.class);
			pageContext.getOut().print(thegeographical_regionPublicationVenueForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing geographical_region for publicationVenueFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for publicationVenueFor tag ");
		}
		return SKIP_BODY;
	}
}

