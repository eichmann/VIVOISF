package edu.uiowa.slis.VIVOISF.Conference;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePopulationTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePopulationTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePopulationTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePopulationTotalIterator theConference = (ConferencePopulationTotalIterator)findAncestorWithClass(this, ConferencePopulationTotalIterator.class);
			pageContext.getOut().print(theConference.getPopulationTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Conference for populationTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Conference for populationTotal tag ");
		}
		return SKIP_BODY;
	}
}

