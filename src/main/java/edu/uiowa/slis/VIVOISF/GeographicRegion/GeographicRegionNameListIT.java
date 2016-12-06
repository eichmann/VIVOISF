package edu.uiowa.slis.VIVOISF.GeographicRegion;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicRegionNameListIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicRegionNameListIT currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicRegionNameListIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicRegionNameListITIterator theGeographicRegion = (GeographicRegionNameListITIterator)findAncestorWithClass(this, GeographicRegionNameListITIterator.class);
			pageContext.getOut().print(theGeographicRegion.getNameListIT());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicRegion for nameListIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicRegion for nameListIT tag ");
		}
		return SKIP_BODY;
	}
}

