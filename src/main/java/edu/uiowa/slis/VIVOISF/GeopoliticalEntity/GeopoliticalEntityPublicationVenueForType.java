package edu.uiowa.slis.VIVOISF.GeopoliticalEntity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeopoliticalEntityPublicationVenueForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeopoliticalEntityPublicationVenueForType currentInstance = null;
	private static final Log log = LogFactory.getLog(GeopoliticalEntityPublicationVenueForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GeopoliticalEntityPublicationVenueForIterator theGeopoliticalEntityPublicationVenueForIterator = (GeopoliticalEntityPublicationVenueForIterator)findAncestorWithClass(this, GeopoliticalEntityPublicationVenueForIterator.class);
			pageContext.getOut().print(theGeopoliticalEntityPublicationVenueForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing GeopoliticalEntity for publicationVenueFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeopoliticalEntity for publicationVenueFor tag ");
		}
		return SKIP_BODY;
	}
}

