package edu.uiowa.slis.VIVOISF.Conference;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferenceCountryAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferenceCountryAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferenceCountryAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferenceCountryAreaUnitIterator theConference = (ConferenceCountryAreaUnitIterator)findAncestorWithClass(this, ConferenceCountryAreaUnitIterator.class);
			pageContext.getOut().print(theConference.getCountryAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Conference for countryAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Conference for countryAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

