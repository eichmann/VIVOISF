package edu.uiowa.slis.VIVOISF.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationLandAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LocationLandAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationLandAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LocationLandAreaYearIterator theLocation = (LocationLandAreaYearIterator)findAncestorWithClass(this, LocationLandAreaYearIterator.class);
			pageContext.getOut().print(theLocation.getLandAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for landAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for landAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

