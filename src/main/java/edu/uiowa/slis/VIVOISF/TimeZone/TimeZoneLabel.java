package edu.uiowa.slis.VIVOISF.TimeZone;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TimeZoneLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TimeZoneLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(TimeZoneLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			TimeZone theTimeZone = (TimeZone)findAncestorWithClass(this, TimeZone.class);
			if (!theTimeZone.commitNeeded) {
				pageContext.getOut().print(theTimeZone.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing TimeZone for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing TimeZone for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			TimeZone theTimeZone = (TimeZone)findAncestorWithClass(this, TimeZone.class);
			return theTimeZone.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing TimeZone for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing TimeZone for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			TimeZone theTimeZone = (TimeZone)findAncestorWithClass(this, TimeZone.class);
			theTimeZone.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing TimeZone for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing TimeZone for label tag ");
		}
	}
}

