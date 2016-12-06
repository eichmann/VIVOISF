package edu.uiowa.slis.VIVOISF.DateTimeInterval;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeIntervalPlaceOfPublication extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeIntervalPlaceOfPublication currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeIntervalPlaceOfPublication.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeInterval theDateTimeInterval = (DateTimeInterval)findAncestorWithClass(this, DateTimeInterval.class);
			if (!theDateTimeInterval.commitNeeded) {
				pageContext.getOut().print(theDateTimeInterval.getPlaceOfPublication());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeInterval for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeInterval for placeOfPublication tag ");
		}
		return SKIP_BODY;
	}

	public String getPlaceOfPublication() throws JspTagException {
		try {
			DateTimeInterval theDateTimeInterval = (DateTimeInterval)findAncestorWithClass(this, DateTimeInterval.class);
			return theDateTimeInterval.getPlaceOfPublication();
		} catch (Exception e) {
			log.error(" Can't find enclosing DateTimeInterval for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeInterval for placeOfPublication tag ");
		}
	}

	public void setPlaceOfPublication(String placeOfPublication) throws JspTagException {
		try {
			DateTimeInterval theDateTimeInterval = (DateTimeInterval)findAncestorWithClass(this, DateTimeInterval.class);
			theDateTimeInterval.setPlaceOfPublication(placeOfPublication);
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeInterval for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeInterval for placeOfPublication tag ");
		}
	}
}

