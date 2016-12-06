package edu.uiowa.slis.VIVOISF.GeographicRegion;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicRegionNameListZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicRegionNameListZH currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicRegionNameListZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicRegionNameListZHIterator theGeographicRegion = (GeographicRegionNameListZHIterator)findAncestorWithClass(this, GeographicRegionNameListZHIterator.class);
			pageContext.getOut().print(theGeographicRegion.getNameListZH());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicRegion for nameListZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicRegion for nameListZH tag ");
		}
		return SKIP_BODY;
	}
}

