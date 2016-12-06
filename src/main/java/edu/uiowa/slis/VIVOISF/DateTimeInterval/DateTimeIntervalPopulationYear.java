package edu.uiowa.slis.VIVOISF.DateTimeInterval;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeIntervalPopulationYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeIntervalPopulationYear currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeIntervalPopulationYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeIntervalPopulationYearIterator theDateTimeInterval = (DateTimeIntervalPopulationYearIterator)findAncestorWithClass(this, DateTimeIntervalPopulationYearIterator.class);
			pageContext.getOut().print(theDateTimeInterval.getPopulationYear());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeInterval for populationYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeInterval for populationYear tag ");
		}
		return SKIP_BODY;
	}
}

