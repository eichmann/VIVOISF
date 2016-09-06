package edu.uiowa.slis.VIVOISF.DateTimeInterval;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeIntervalLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeIntervalLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeIntervalLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeInterval theDateTimeInterval = (DateTimeInterval)findAncestorWithClass(this, DateTimeInterval.class);
			if (!theDateTimeInterval.commitNeeded) {
				pageContext.getOut().print(theDateTimeInterval.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeInterval for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeInterval for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			DateTimeInterval theDateTimeInterval = (DateTimeInterval)findAncestorWithClass(this, DateTimeInterval.class);
			return theDateTimeInterval.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing DateTimeInterval for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeInterval for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			DateTimeInterval theDateTimeInterval = (DateTimeInterval)findAncestorWithClass(this, DateTimeInterval.class);
			theDateTimeInterval.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeInterval for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeInterval for label tag ");
		}
	}
}

