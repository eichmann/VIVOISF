package edu.uiowa.slis.VIVOISF.GeographicRegion;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicRegionNameShortAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicRegionNameShortAR currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicRegionNameShortAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicRegionNameShortARIterator theGeographicRegion = (GeographicRegionNameShortARIterator)findAncestorWithClass(this, GeographicRegionNameShortARIterator.class);
			pageContext.getOut().print(theGeographicRegion.getNameShortAR());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicRegion for nameShortAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicRegion for nameShortAR tag ");
		}
		return SKIP_BODY;
	}
}

