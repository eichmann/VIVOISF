package edu.uiowa.slis.VIVOISF.GeographicRegion;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicRegionNameShortEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicRegionNameShortEN currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicRegionNameShortEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicRegionNameShortENIterator theGeographicRegion = (GeographicRegionNameShortENIterator)findAncestorWithClass(this, GeographicRegionNameShortENIterator.class);
			pageContext.getOut().print(theGeographicRegion.getNameShortEN());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicRegion for nameShortEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicRegion for nameShortEN tag ");
		}
		return SKIP_BODY;
	}
}

