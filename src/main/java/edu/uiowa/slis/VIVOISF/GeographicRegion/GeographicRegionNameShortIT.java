package edu.uiowa.slis.VIVOISF.GeographicRegion;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicRegionNameShortIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicRegionNameShortIT currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicRegionNameShortIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicRegionNameShortITIterator theGeographicRegion = (GeographicRegionNameShortITIterator)findAncestorWithClass(this, GeographicRegionNameShortITIterator.class);
			pageContext.getOut().print(theGeographicRegion.getNameShortIT());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicRegion for nameShortIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicRegion for nameShortIT tag ");
		}
		return SKIP_BODY;
	}
}

