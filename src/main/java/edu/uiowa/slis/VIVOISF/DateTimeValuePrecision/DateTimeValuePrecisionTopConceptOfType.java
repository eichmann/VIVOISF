package edu.uiowa.slis.VIVOISF.DateTimeValuePrecision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValuePrecisionTopConceptOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValuePrecisionTopConceptOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValuePrecisionTopConceptOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DateTimeValuePrecisionTopConceptOfIterator theDateTimeValuePrecisionTopConceptOfIterator = (DateTimeValuePrecisionTopConceptOfIterator)findAncestorWithClass(this, DateTimeValuePrecisionTopConceptOfIterator.class);
			pageContext.getOut().print(theDateTimeValuePrecisionTopConceptOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValuePrecision for topConceptOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValuePrecision for topConceptOf tag ");
		}
		return SKIP_BODY;
	}
}

