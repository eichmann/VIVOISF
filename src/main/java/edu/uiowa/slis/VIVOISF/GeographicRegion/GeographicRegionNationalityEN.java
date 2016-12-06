package edu.uiowa.slis.VIVOISF.GeographicRegion;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicRegionNationalityEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicRegionNationalityEN currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicRegionNationalityEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicRegionNationalityENIterator theGeographicRegion = (GeographicRegionNationalityENIterator)findAncestorWithClass(this, GeographicRegionNationalityENIterator.class);
			pageContext.getOut().print(theGeographicRegion.getNationalityEN());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicRegion for nationalityEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicRegion for nationalityEN tag ");
		}
		return SKIP_BODY;
	}
}

