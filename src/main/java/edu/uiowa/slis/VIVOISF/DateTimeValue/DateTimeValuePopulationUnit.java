package edu.uiowa.slis.VIVOISF.DateTimeValue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValuePopulationUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValuePopulationUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValuePopulationUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeValuePopulationUnitIterator theDateTimeValue = (DateTimeValuePopulationUnitIterator)findAncestorWithClass(this, DateTimeValuePopulationUnitIterator.class);
			pageContext.getOut().print(theDateTimeValue.getPopulationUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValue for populationUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for populationUnit tag ");
		}
		return SKIP_BODY;
	}
}

