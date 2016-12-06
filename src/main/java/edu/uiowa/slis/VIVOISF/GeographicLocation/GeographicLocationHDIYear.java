package edu.uiowa.slis.VIVOISF.GeographicLocation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicLocationHDIYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicLocationHDIYear currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicLocationHDIYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicLocationHDIYearIterator theGeographicLocation = (GeographicLocationHDIYearIterator)findAncestorWithClass(this, GeographicLocationHDIYearIterator.class);
			pageContext.getOut().print(theGeographicLocation.getHDIYear());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicLocation for HDIYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicLocation for HDIYear tag ");
		}
		return SKIP_BODY;
	}
}

