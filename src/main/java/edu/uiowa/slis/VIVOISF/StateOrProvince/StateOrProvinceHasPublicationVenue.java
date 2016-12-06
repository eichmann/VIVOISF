package edu.uiowa.slis.VIVOISF.StateOrProvince;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StateOrProvinceHasPublicationVenue extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StateOrProvinceHasPublicationVenue currentInstance = null;
	private static final Log log = LogFactory.getLog(StateOrProvinceHasPublicationVenue.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StateOrProvinceHasPublicationVenueIterator theStateOrProvinceHasPublicationVenueIterator = (StateOrProvinceHasPublicationVenueIterator)findAncestorWithClass(this, StateOrProvinceHasPublicationVenueIterator.class);
			pageContext.getOut().print(theStateOrProvinceHasPublicationVenueIterator.getHasPublicationVenue());
		} catch (Exception e) {
			log.error("Can't find enclosing StateOrProvince for hasPublicationVenue tag ", e);
			throw new JspTagException("Error: Can't find enclosing StateOrProvince for hasPublicationVenue tag ");
		}
		return SKIP_BODY;
	}
}

