package edu.uiowa.slis.VIVOISF.DateTimeValue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValuePlaceOfPublication extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValuePlaceOfPublication currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValuePlaceOfPublication.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeValue theDateTimeValue = (DateTimeValue)findAncestorWithClass(this, DateTimeValue.class);
			if (!theDateTimeValue.commitNeeded) {
				pageContext.getOut().print(theDateTimeValue.getPlaceOfPublication());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValue for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for placeOfPublication tag ");
		}
		return SKIP_BODY;
	}

	public String getPlaceOfPublication() throws JspTagException {
		try {
			DateTimeValue theDateTimeValue = (DateTimeValue)findAncestorWithClass(this, DateTimeValue.class);
			return theDateTimeValue.getPlaceOfPublication();
		} catch (Exception e) {
			log.error(" Can't find enclosing DateTimeValue for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for placeOfPublication tag ");
		}
	}

	public void setPlaceOfPublication(String placeOfPublication) throws JspTagException {
		try {
			DateTimeValue theDateTimeValue = (DateTimeValue)findAncestorWithClass(this, DateTimeValue.class);
			theDateTimeValue.setPlaceOfPublication(placeOfPublication);
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValue for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for placeOfPublication tag ");
		}
	}
}

