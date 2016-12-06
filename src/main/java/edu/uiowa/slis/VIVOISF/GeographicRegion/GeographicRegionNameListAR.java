package edu.uiowa.slis.VIVOISF.GeographicRegion;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicRegionNameListAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicRegionNameListAR currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicRegionNameListAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicRegionNameListARIterator theGeographicRegion = (GeographicRegionNameListARIterator)findAncestorWithClass(this, GeographicRegionNameListARIterator.class);
			pageContext.getOut().print(theGeographicRegion.getNameListAR());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicRegion for nameListAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicRegion for nameListAR tag ");
		}
		return SKIP_BODY;
	}
}

