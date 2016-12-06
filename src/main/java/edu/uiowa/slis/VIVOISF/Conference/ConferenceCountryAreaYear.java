package edu.uiowa.slis.VIVOISF.Conference;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferenceCountryAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferenceCountryAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferenceCountryAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferenceCountryAreaYearIterator theConference = (ConferenceCountryAreaYearIterator)findAncestorWithClass(this, ConferenceCountryAreaYearIterator.class);
			pageContext.getOut().print(theConference.getCountryAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Conference for countryAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Conference for countryAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

