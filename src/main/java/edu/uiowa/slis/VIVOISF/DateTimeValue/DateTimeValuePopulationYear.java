package edu.uiowa.slis.VIVOISF.DateTimeValue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValuePopulationYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValuePopulationYear currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValuePopulationYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeValuePopulationYearIterator theDateTimeValue = (DateTimeValuePopulationYearIterator)findAncestorWithClass(this, DateTimeValuePopulationYearIterator.class);
			pageContext.getOut().print(theDateTimeValue.getPopulationYear());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValue for populationYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for populationYear tag ");
		}
		return SKIP_BODY;
	}
}

