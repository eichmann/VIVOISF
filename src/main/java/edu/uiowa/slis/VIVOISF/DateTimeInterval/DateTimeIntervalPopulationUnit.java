package edu.uiowa.slis.VIVOISF.DateTimeInterval;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeIntervalPopulationUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeIntervalPopulationUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeIntervalPopulationUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeIntervalPopulationUnitIterator theDateTimeInterval = (DateTimeIntervalPopulationUnitIterator)findAncestorWithClass(this, DateTimeIntervalPopulationUnitIterator.class);
			pageContext.getOut().print(theDateTimeInterval.getPopulationUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeInterval for populationUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeInterval for populationUnit tag ");
		}
		return SKIP_BODY;
	}
}

