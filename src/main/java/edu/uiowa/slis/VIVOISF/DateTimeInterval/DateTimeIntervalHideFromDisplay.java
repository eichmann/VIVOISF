package edu.uiowa.slis.VIVOISF.DateTimeInterval;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeIntervalHideFromDisplay extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeIntervalHideFromDisplay currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeIntervalHideFromDisplay.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeInterval theDateTimeInterval = (DateTimeInterval)findAncestorWithClass(this, DateTimeInterval.class);
			if (!theDateTimeInterval.commitNeeded) {
				pageContext.getOut().print(theDateTimeInterval.getHideFromDisplay());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeInterval for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeInterval for hideFromDisplay tag ");
		}
		return SKIP_BODY;
	}

	public String getHideFromDisplay() throws JspTagException {
		try {
			DateTimeInterval theDateTimeInterval = (DateTimeInterval)findAncestorWithClass(this, DateTimeInterval.class);
			return theDateTimeInterval.getHideFromDisplay();
		} catch (Exception e) {
			log.error(" Can't find enclosing DateTimeInterval for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeInterval for hideFromDisplay tag ");
		}
	}

	public void setHideFromDisplay(String hideFromDisplay) throws JspTagException {
		try {
			DateTimeInterval theDateTimeInterval = (DateTimeInterval)findAncestorWithClass(this, DateTimeInterval.class);
			theDateTimeInterval.setHideFromDisplay(hideFromDisplay);
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeInterval for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeInterval for hideFromDisplay tag ");
		}
	}
}

