package edu.uiowa.slis.VIVOISF.DateTimeValuePrecision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValuePrecisionResearchAreaOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValuePrecisionResearchAreaOf currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValuePrecisionResearchAreaOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DateTimeValuePrecisionResearchAreaOfIterator theDateTimeValuePrecisionResearchAreaOfIterator = (DateTimeValuePrecisionResearchAreaOfIterator)findAncestorWithClass(this, DateTimeValuePrecisionResearchAreaOfIterator.class);
			pageContext.getOut().print(theDateTimeValuePrecisionResearchAreaOfIterator.getResearchAreaOf());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValuePrecision for researchAreaOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValuePrecision for researchAreaOf tag ");
		}
		return SKIP_BODY;
	}
}

