package edu.uiowa.slis.VIVOISF.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationHDINotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LocationHDINotes currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationHDINotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LocationHDINotesIterator theLocation = (LocationHDINotesIterator)findAncestorWithClass(this, LocationHDINotesIterator.class);
			pageContext.getOut().print(theLocation.getHDINotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for HDINotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for HDINotes tag ");
		}
		return SKIP_BODY;
	}
}

