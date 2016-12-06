package edu.uiowa.slis.VIVOISF.GeographicRegion;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicRegionNameOfficialEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicRegionNameOfficialEN currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicRegionNameOfficialEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicRegionNameOfficialENIterator theGeographicRegion = (GeographicRegionNameOfficialENIterator)findAncestorWithClass(this, GeographicRegionNameOfficialENIterator.class);
			pageContext.getOut().print(theGeographicRegion.getNameOfficialEN());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicRegion for nameOfficialEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicRegion for nameOfficialEN tag ");
		}
		return SKIP_BODY;
	}
}

