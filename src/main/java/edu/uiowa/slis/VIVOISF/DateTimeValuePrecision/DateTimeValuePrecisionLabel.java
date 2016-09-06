package edu.uiowa.slis.VIVOISF.DateTimeValuePrecision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValuePrecisionLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValuePrecisionLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValuePrecisionLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeValuePrecision theDateTimeValuePrecision = (DateTimeValuePrecision)findAncestorWithClass(this, DateTimeValuePrecision.class);
			if (!theDateTimeValuePrecision.commitNeeded) {
				pageContext.getOut().print(theDateTimeValuePrecision.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValuePrecision for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValuePrecision for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			DateTimeValuePrecision theDateTimeValuePrecision = (DateTimeValuePrecision)findAncestorWithClass(this, DateTimeValuePrecision.class);
			return theDateTimeValuePrecision.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing DateTimeValuePrecision for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValuePrecision for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			DateTimeValuePrecision theDateTimeValuePrecision = (DateTimeValuePrecision)findAncestorWithClass(this, DateTimeValuePrecision.class);
			theDateTimeValuePrecision.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValuePrecision for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValuePrecision for label tag ");
		}
	}
}

