package edu.uiowa.slis.VIVOISF.Conference;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePopulationYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePopulationYear currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePopulationYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePopulationYearIterator theConference = (ConferencePopulationYearIterator)findAncestorWithClass(this, ConferencePopulationYearIterator.class);
			pageContext.getOut().print(theConference.getPopulationYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Conference for populationYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Conference for populationYear tag ");
		}
		return SKIP_BODY;
	}
}

