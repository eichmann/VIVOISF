package edu.uiowa.slis.VIVOISF.StateOrProvince;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StateOrProvinceHasPublicationVenueType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StateOrProvinceHasPublicationVenueType currentInstance = null;
	private static final Log log = LogFactory.getLog(StateOrProvinceHasPublicationVenueType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StateOrProvinceHasPublicationVenueIterator theStateOrProvinceHasPublicationVenueIterator = (StateOrProvinceHasPublicationVenueIterator)findAncestorWithClass(this, StateOrProvinceHasPublicationVenueIterator.class);
			pageContext.getOut().print(theStateOrProvinceHasPublicationVenueIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing StateOrProvince for hasPublicationVenue tag ", e);
			throw new JspTagException("Error: Can't find enclosing StateOrProvince for hasPublicationVenue tag ");
		}
		return SKIP_BODY;
	}
}

