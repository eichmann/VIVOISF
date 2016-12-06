package edu.uiowa.slis.VIVOISF.GeographicRegion;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicRegionUrl extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicRegionUrl currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicRegionUrl.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicRegionUrlIterator theGeographicRegion = (GeographicRegionUrlIterator)findAncestorWithClass(this, GeographicRegionUrlIterator.class);
			pageContext.getOut().print(theGeographicRegion.getUrl());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicRegion for url tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicRegion for url tag ");
		}
		return SKIP_BODY;
	}
}

