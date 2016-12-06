package edu.uiowa.slis.VIVOISF.GeographicRegion;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicRegionNameOfficialZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicRegionNameOfficialZH currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicRegionNameOfficialZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicRegionNameOfficialZHIterator theGeographicRegion = (GeographicRegionNameOfficialZHIterator)findAncestorWithClass(this, GeographicRegionNameOfficialZHIterator.class);
			pageContext.getOut().print(theGeographicRegion.getNameOfficialZH());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicRegion for nameOfficialZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicRegion for nameOfficialZH tag ");
		}
		return SKIP_BODY;
	}
}

