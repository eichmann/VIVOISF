package edu.uiowa.slis.VIVOISF.GeographicLocation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicLocationGDPYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicLocationGDPYear currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicLocationGDPYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicLocationGDPYearIterator theGeographicLocation = (GeographicLocationGDPYearIterator)findAncestorWithClass(this, GeographicLocationGDPYearIterator.class);
			pageContext.getOut().print(theGeographicLocation.getGDPYear());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicLocation for GDPYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicLocation for GDPYear tag ");
		}
		return SKIP_BODY;
	}
}

