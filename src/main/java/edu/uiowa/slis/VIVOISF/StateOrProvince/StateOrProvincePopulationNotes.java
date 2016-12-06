package edu.uiowa.slis.VIVOISF.StateOrProvince;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StateOrProvincePopulationNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StateOrProvincePopulationNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(StateOrProvincePopulationNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StateOrProvincePopulationNotesIterator theStateOrProvince = (StateOrProvincePopulationNotesIterator)findAncestorWithClass(this, StateOrProvincePopulationNotesIterator.class);
			pageContext.getOut().print(theStateOrProvince.getPopulationNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing StateOrProvince for populationNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing StateOrProvince for populationNotes tag ");
		}
		return SKIP_BODY;
	}
}

