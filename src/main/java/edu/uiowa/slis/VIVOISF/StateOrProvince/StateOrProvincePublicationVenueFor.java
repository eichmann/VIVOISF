package edu.uiowa.slis.VIVOISF.StateOrProvince;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StateOrProvincePublicationVenueFor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StateOrProvincePublicationVenueFor currentInstance = null;
	private static final Log log = LogFactory.getLog(StateOrProvincePublicationVenueFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StateOrProvincePublicationVenueForIterator theStateOrProvincePublicationVenueForIterator = (StateOrProvincePublicationVenueForIterator)findAncestorWithClass(this, StateOrProvincePublicationVenueForIterator.class);
			pageContext.getOut().print(theStateOrProvincePublicationVenueForIterator.getPublicationVenueFor());
		} catch (Exception e) {
			log.error("Can't find enclosing StateOrProvince for publicationVenueFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing StateOrProvince for publicationVenueFor tag ");
		}
		return SKIP_BODY;
	}
}

