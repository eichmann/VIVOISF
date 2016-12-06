package edu.uiowa.slis.VIVOISF.DateTimeInterval;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeIntervalAbbreviation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeIntervalAbbreviation currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeIntervalAbbreviation.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeInterval theDateTimeInterval = (DateTimeInterval)findAncestorWithClass(this, DateTimeInterval.class);
			if (!theDateTimeInterval.commitNeeded) {
				pageContext.getOut().print(theDateTimeInterval.getAbbreviation());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeInterval for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeInterval for abbreviation tag ");
		}
		return SKIP_BODY;
	}

	public String getAbbreviation() throws JspTagException {
		try {
			DateTimeInterval theDateTimeInterval = (DateTimeInterval)findAncestorWithClass(this, DateTimeInterval.class);
			return theDateTimeInterval.getAbbreviation();
		} catch (Exception e) {
			log.error(" Can't find enclosing DateTimeInterval for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeInterval for abbreviation tag ");
		}
	}

	public void setAbbreviation(String abbreviation) throws JspTagException {
		try {
			DateTimeInterval theDateTimeInterval = (DateTimeInterval)findAncestorWithClass(this, DateTimeInterval.class);
			theDateTimeInterval.setAbbreviation(abbreviation);
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeInterval for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeInterval for abbreviation tag ");
		}
	}
}

