package edu.uiowa.slis.VIVOISF.DateTimeValue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValueHideFromDisplay extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValueHideFromDisplay currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValueHideFromDisplay.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeValue theDateTimeValue = (DateTimeValue)findAncestorWithClass(this, DateTimeValue.class);
			if (!theDateTimeValue.commitNeeded) {
				pageContext.getOut().print(theDateTimeValue.getHideFromDisplay());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValue for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for hideFromDisplay tag ");
		}
		return SKIP_BODY;
	}

	public String getHideFromDisplay() throws JspTagException {
		try {
			DateTimeValue theDateTimeValue = (DateTimeValue)findAncestorWithClass(this, DateTimeValue.class);
			return theDateTimeValue.getHideFromDisplay();
		} catch (Exception e) {
			log.error(" Can't find enclosing DateTimeValue for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for hideFromDisplay tag ");
		}
	}

	public void setHideFromDisplay(String hideFromDisplay) throws JspTagException {
		try {
			DateTimeValue theDateTimeValue = (DateTimeValue)findAncestorWithClass(this, DateTimeValue.class);
			theDateTimeValue.setHideFromDisplay(hideFromDisplay);
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValue for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for hideFromDisplay tag ");
		}
	}
}

