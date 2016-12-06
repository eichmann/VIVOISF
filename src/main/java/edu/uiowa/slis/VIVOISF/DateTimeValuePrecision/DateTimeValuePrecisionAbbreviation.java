package edu.uiowa.slis.VIVOISF.DateTimeValuePrecision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValuePrecisionAbbreviation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValuePrecisionAbbreviation currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValuePrecisionAbbreviation.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeValuePrecision theDateTimeValuePrecision = (DateTimeValuePrecision)findAncestorWithClass(this, DateTimeValuePrecision.class);
			if (!theDateTimeValuePrecision.commitNeeded) {
				pageContext.getOut().print(theDateTimeValuePrecision.getAbbreviation());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValuePrecision for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValuePrecision for abbreviation tag ");
		}
		return SKIP_BODY;
	}

	public String getAbbreviation() throws JspTagException {
		try {
			DateTimeValuePrecision theDateTimeValuePrecision = (DateTimeValuePrecision)findAncestorWithClass(this, DateTimeValuePrecision.class);
			return theDateTimeValuePrecision.getAbbreviation();
		} catch (Exception e) {
			log.error(" Can't find enclosing DateTimeValuePrecision for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValuePrecision for abbreviation tag ");
		}
	}

	public void setAbbreviation(String abbreviation) throws JspTagException {
		try {
			DateTimeValuePrecision theDateTimeValuePrecision = (DateTimeValuePrecision)findAncestorWithClass(this, DateTimeValuePrecision.class);
			theDateTimeValuePrecision.setAbbreviation(abbreviation);
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValuePrecision for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValuePrecision for abbreviation tag ");
		}
	}
}

