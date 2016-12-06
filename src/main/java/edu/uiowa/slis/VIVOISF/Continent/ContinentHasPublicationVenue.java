package edu.uiowa.slis.VIVOISF.Continent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinentHasPublicationVenue extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContinentHasPublicationVenue currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinentHasPublicationVenue.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ContinentHasPublicationVenueIterator theContinentHasPublicationVenueIterator = (ContinentHasPublicationVenueIterator)findAncestorWithClass(this, ContinentHasPublicationVenueIterator.class);
			pageContext.getOut().print(theContinentHasPublicationVenueIterator.getHasPublicationVenue());
		} catch (Exception e) {
			log.error("Can't find enclosing Continent for hasPublicationVenue tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for hasPublicationVenue tag ");
		}
		return SKIP_BODY;
	}
}

