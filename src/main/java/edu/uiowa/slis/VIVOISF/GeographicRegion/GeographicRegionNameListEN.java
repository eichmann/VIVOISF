package edu.uiowa.slis.VIVOISF.GeographicRegion;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicRegionNameListEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicRegionNameListEN currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicRegionNameListEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicRegionNameListENIterator theGeographicRegion = (GeographicRegionNameListENIterator)findAncestorWithClass(this, GeographicRegionNameListENIterator.class);
			pageContext.getOut().print(theGeographicRegion.getNameListEN());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicRegion for nameListEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicRegion for nameListEN tag ");
		}
		return SKIP_BODY;
	}
}

