package edu.uiowa.slis.VIVOISF.DateTimeInterval;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeIntervalPopulationTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeIntervalPopulationTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeIntervalPopulationTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeIntervalPopulationTotalIterator theDateTimeInterval = (DateTimeIntervalPopulationTotalIterator)findAncestorWithClass(this, DateTimeIntervalPopulationTotalIterator.class);
			pageContext.getOut().print(theDateTimeInterval.getPopulationTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeInterval for populationTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeInterval for populationTotal tag ");
		}
		return SKIP_BODY;
	}
}

