package edu.uiowa.slis.VIVOISF.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationDateTimeValue extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LocationDateTimeValue currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationDateTimeValue.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LocationDateTimeValueIterator theLocationDateTimeValueIterator = (LocationDateTimeValueIterator)findAncestorWithClass(this, LocationDateTimeValueIterator.class);
			pageContext.getOut().print(theLocationDateTimeValueIterator.getDateTimeValue());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for dateTimeValue tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for dateTimeValue tag ");
		}
		return SKIP_BODY;
	}
}

