package edu.uiowa.slis.VIVOISF.DateTimeValue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValueAbbreviation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValueAbbreviation currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValueAbbreviation.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeValue theDateTimeValue = (DateTimeValue)findAncestorWithClass(this, DateTimeValue.class);
			if (!theDateTimeValue.commitNeeded) {
				pageContext.getOut().print(theDateTimeValue.getAbbreviation());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValue for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for abbreviation tag ");
		}
		return SKIP_BODY;
	}

	public String getAbbreviation() throws JspTagException {
		try {
			DateTimeValue theDateTimeValue = (DateTimeValue)findAncestorWithClass(this, DateTimeValue.class);
			return theDateTimeValue.getAbbreviation();
		} catch (Exception e) {
			log.error(" Can't find enclosing DateTimeValue for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for abbreviation tag ");
		}
	}

	public void setAbbreviation(String abbreviation) throws JspTagException {
		try {
			DateTimeValue theDateTimeValue = (DateTimeValue)findAncestorWithClass(this, DateTimeValue.class);
			theDateTimeValue.setAbbreviation(abbreviation);
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValue for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for abbreviation tag ");
		}
	}
}

