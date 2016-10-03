package edu.uiowa.slis.VIVOISF.DateTimeValuePrecision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValuePrecisionTopConceptOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValuePrecisionTopConceptOf currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValuePrecisionTopConceptOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DateTimeValuePrecisionTopConceptOfIterator theDateTimeValuePrecisionTopConceptOfIterator = (DateTimeValuePrecisionTopConceptOfIterator)findAncestorWithClass(this, DateTimeValuePrecisionTopConceptOfIterator.class);
			pageContext.getOut().print(theDateTimeValuePrecisionTopConceptOfIterator.getTopConceptOf());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValuePrecision for topConceptOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValuePrecision for topConceptOf tag ");
		}
		return SKIP_BODY;
	}
}

