package edu.uiowa.slis.VIVOISF.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationGDPYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LocationGDPYear currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationGDPYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LocationGDPYearIterator theLocation = (LocationGDPYearIterator)findAncestorWithClass(this, LocationGDPYearIterator.class);
			pageContext.getOut().print(theLocation.getGDPYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for GDPYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for GDPYear tag ");
		}
		return SKIP_BODY;
	}
}

