package edu.uiowa.slis.VIVOISF.GeographicRegion;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicRegionNameOfficialFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicRegionNameOfficialFR currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicRegionNameOfficialFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicRegionNameOfficialFRIterator theGeographicRegion = (GeographicRegionNameOfficialFRIterator)findAncestorWithClass(this, GeographicRegionNameOfficialFRIterator.class);
			pageContext.getOut().print(theGeographicRegion.getNameOfficialFR());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicRegion for nameOfficialFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicRegion for nameOfficialFR tag ");
		}
		return SKIP_BODY;
	}
}

