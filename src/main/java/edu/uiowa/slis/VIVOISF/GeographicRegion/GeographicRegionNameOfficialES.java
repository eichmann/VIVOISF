package edu.uiowa.slis.VIVOISF.GeographicRegion;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicRegionNameOfficialES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicRegionNameOfficialES currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicRegionNameOfficialES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicRegionNameOfficialESIterator theGeographicRegion = (GeographicRegionNameOfficialESIterator)findAncestorWithClass(this, GeographicRegionNameOfficialESIterator.class);
			pageContext.getOut().print(theGeographicRegion.getNameOfficialES());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicRegion for nameOfficialES tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicRegion for nameOfficialES tag ");
		}
		return SKIP_BODY;
	}
}

