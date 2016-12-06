package edu.uiowa.slis.VIVOISF.GeographicRegion;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicRegionNationalityIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicRegionNationalityIT currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicRegionNationalityIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicRegionNationalityITIterator theGeographicRegion = (GeographicRegionNationalityITIterator)findAncestorWithClass(this, GeographicRegionNationalityITIterator.class);
			pageContext.getOut().print(theGeographicRegion.getNationalityIT());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicRegion for nationalityIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicRegion for nationalityIT tag ");
		}
		return SKIP_BODY;
	}
}

