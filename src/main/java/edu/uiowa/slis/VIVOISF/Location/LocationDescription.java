package edu.uiowa.slis.VIVOISF.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationDescription extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LocationDescription currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationDescription.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LocationDescriptionIterator theLocation = (LocationDescriptionIterator)findAncestorWithClass(this, LocationDescriptionIterator.class);
			pageContext.getOut().print(theLocation.getDescription());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for description tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for description tag ");
		}
		return SKIP_BODY;
	}
}

