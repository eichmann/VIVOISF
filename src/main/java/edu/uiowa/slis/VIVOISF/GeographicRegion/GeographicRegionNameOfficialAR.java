package edu.uiowa.slis.VIVOISF.GeographicRegion;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicRegionNameOfficialAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicRegionNameOfficialAR currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicRegionNameOfficialAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicRegionNameOfficialARIterator theGeographicRegion = (GeographicRegionNameOfficialARIterator)findAncestorWithClass(this, GeographicRegionNameOfficialARIterator.class);
			pageContext.getOut().print(theGeographicRegion.getNameOfficialAR());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicRegion for nameOfficialAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicRegion for nameOfficialAR tag ");
		}
		return SKIP_BODY;
	}
}

