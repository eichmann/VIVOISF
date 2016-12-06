package edu.uiowa.slis.VIVOISF.GeographicRegion;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicRegionNameShortES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicRegionNameShortES currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicRegionNameShortES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicRegionNameShortESIterator theGeographicRegion = (GeographicRegionNameShortESIterator)findAncestorWithClass(this, GeographicRegionNameShortESIterator.class);
			pageContext.getOut().print(theGeographicRegion.getNameShortES());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicRegion for nameShortES tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicRegion for nameShortES tag ");
		}
		return SKIP_BODY;
	}
}

