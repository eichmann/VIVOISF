package edu.uiowa.slis.VIVOISF.Continent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinentHasPublicationVenueType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContinentHasPublicationVenueType currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinentHasPublicationVenueType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ContinentHasPublicationVenueIterator theContinentHasPublicationVenueIterator = (ContinentHasPublicationVenueIterator)findAncestorWithClass(this, ContinentHasPublicationVenueIterator.class);
			pageContext.getOut().print(theContinentHasPublicationVenueIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Continent for hasPublicationVenue tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for hasPublicationVenue tag ");
		}
		return SKIP_BODY;
	}
}

