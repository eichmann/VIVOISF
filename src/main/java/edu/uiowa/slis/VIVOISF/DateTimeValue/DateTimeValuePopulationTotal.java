package edu.uiowa.slis.VIVOISF.DateTimeValue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValuePopulationTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValuePopulationTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValuePopulationTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeValuePopulationTotalIterator theDateTimeValue = (DateTimeValuePopulationTotalIterator)findAncestorWithClass(this, DateTimeValuePopulationTotalIterator.class);
			pageContext.getOut().print(theDateTimeValue.getPopulationTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValue for populationTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for populationTotal tag ");
		}
		return SKIP_BODY;
	}
}

