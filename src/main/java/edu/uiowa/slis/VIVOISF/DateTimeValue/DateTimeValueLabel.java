package edu.uiowa.slis.VIVOISF.DateTimeValue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValueLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValueLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValueLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeValue theDateTimeValue = (DateTimeValue)findAncestorWithClass(this, DateTimeValue.class);
			if (!theDateTimeValue.commitNeeded) {
				pageContext.getOut().print(theDateTimeValue.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValue for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			DateTimeValue theDateTimeValue = (DateTimeValue)findAncestorWithClass(this, DateTimeValue.class);
			return theDateTimeValue.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing DateTimeValue for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			DateTimeValue theDateTimeValue = (DateTimeValue)findAncestorWithClass(this, DateTimeValue.class);
			theDateTimeValue.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValue for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for label tag ");
		}
	}
}

