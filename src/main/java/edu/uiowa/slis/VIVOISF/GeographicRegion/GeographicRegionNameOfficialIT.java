package edu.uiowa.slis.VIVOISF.GeographicRegion;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicRegionNameOfficialIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicRegionNameOfficialIT currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicRegionNameOfficialIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicRegionNameOfficialITIterator theGeographicRegion = (GeographicRegionNameOfficialITIterator)findAncestorWithClass(this, GeographicRegionNameOfficialITIterator.class);
			pageContext.getOut().print(theGeographicRegion.getNameOfficialIT());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicRegion for nameOfficialIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicRegion for nameOfficialIT tag ");
		}
		return SKIP_BODY;
	}
}

