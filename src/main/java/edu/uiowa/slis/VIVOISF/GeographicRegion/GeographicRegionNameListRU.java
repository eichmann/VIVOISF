package edu.uiowa.slis.VIVOISF.GeographicRegion;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicRegionNameListRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicRegionNameListRU currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicRegionNameListRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicRegionNameListRUIterator theGeographicRegion = (GeographicRegionNameListRUIterator)findAncestorWithClass(this, GeographicRegionNameListRUIterator.class);
			pageContext.getOut().print(theGeographicRegion.getNameListRU());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicRegion for nameListRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicRegion for nameListRU tag ");
		}
		return SKIP_BODY;
	}
}

