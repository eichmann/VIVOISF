package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaPublicationVenueForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaPublicationVenueForType currentInstance = null;
	private static final Log log = LogFactory.getLog(areaPublicationVenueForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			areaPublicationVenueForIterator theareaPublicationVenueForIterator = (areaPublicationVenueForIterator)findAncestorWithClass(this, areaPublicationVenueForIterator.class);
			pageContext.getOut().print(theareaPublicationVenueForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing area for publicationVenueFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for publicationVenueFor tag ");
		}
		return SKIP_BODY;
	}
}

