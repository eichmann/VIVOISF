package edu.uiowa.slis.VIVOISF.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationHDIYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LocationHDIYear currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationHDIYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LocationHDIYearIterator theLocation = (LocationHDIYearIterator)findAncestorWithClass(this, LocationHDIYearIterator.class);
			pageContext.getOut().print(theLocation.getHDIYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for HDIYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for HDIYear tag ");
		}
		return SKIP_BODY;
	}
}

