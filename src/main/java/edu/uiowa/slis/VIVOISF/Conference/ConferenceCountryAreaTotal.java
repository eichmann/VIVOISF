package edu.uiowa.slis.VIVOISF.Conference;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferenceCountryAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferenceCountryAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferenceCountryAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferenceCountryAreaTotalIterator theConference = (ConferenceCountryAreaTotalIterator)findAncestorWithClass(this, ConferenceCountryAreaTotalIterator.class);
			pageContext.getOut().print(theConference.getCountryAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Conference for countryAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Conference for countryAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

