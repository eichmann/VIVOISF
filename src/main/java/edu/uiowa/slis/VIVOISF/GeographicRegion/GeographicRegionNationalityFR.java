package edu.uiowa.slis.VIVOISF.GeographicRegion;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicRegionNationalityFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicRegionNationalityFR currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicRegionNationalityFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicRegionNationalityFRIterator theGeographicRegion = (GeographicRegionNationalityFRIterator)findAncestorWithClass(this, GeographicRegionNationalityFRIterator.class);
			pageContext.getOut().print(theGeographicRegion.getNationalityFR());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicRegion for nationalityFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicRegion for nationalityFR tag ");
		}
		return SKIP_BODY;
	}
}

