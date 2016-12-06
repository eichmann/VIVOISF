package edu.uiowa.slis.VIVOISF.DateTimeValue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValuePopulationNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValuePopulationNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValuePopulationNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeValuePopulationNotesIterator theDateTimeValue = (DateTimeValuePopulationNotesIterator)findAncestorWithClass(this, DateTimeValuePopulationNotesIterator.class);
			pageContext.getOut().print(theDateTimeValue.getPopulationNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValue for populationNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for populationNotes tag ");
		}
		return SKIP_BODY;
	}
}

