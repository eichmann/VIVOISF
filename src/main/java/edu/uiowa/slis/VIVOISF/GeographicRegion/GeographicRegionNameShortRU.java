package edu.uiowa.slis.VIVOISF.GeographicRegion;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicRegionNameShortRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicRegionNameShortRU currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicRegionNameShortRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicRegionNameShortRUIterator theGeographicRegion = (GeographicRegionNameShortRUIterator)findAncestorWithClass(this, GeographicRegionNameShortRUIterator.class);
			pageContext.getOut().print(theGeographicRegion.getNameShortRU());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicRegion for nameShortRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicRegion for nameShortRU tag ");
		}
		return SKIP_BODY;
	}
}

