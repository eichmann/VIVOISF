package edu.uiowa.slis.VIVOISF.GeographicRegion;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicRegionNameOfficialRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicRegionNameOfficialRU currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicRegionNameOfficialRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicRegionNameOfficialRUIterator theGeographicRegion = (GeographicRegionNameOfficialRUIterator)findAncestorWithClass(this, GeographicRegionNameOfficialRUIterator.class);
			pageContext.getOut().print(theGeographicRegion.getNameOfficialRU());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicRegion for nameOfficialRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicRegion for nameOfficialRU tag ");
		}
		return SKIP_BODY;
	}
}

