package edu.uiowa.slis.VIVOISF.GeographicLocation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicLocationAgriculturalAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicLocationAgriculturalAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicLocationAgriculturalAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicLocationAgriculturalAreaYearIterator theGeographicLocation = (GeographicLocationAgriculturalAreaYearIterator)findAncestorWithClass(this, GeographicLocationAgriculturalAreaYearIterator.class);
			pageContext.getOut().print(theGeographicLocation.getAgriculturalAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicLocation for agriculturalAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicLocation for agriculturalAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

