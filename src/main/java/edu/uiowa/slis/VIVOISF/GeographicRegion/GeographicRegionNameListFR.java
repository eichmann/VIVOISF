package edu.uiowa.slis.VIVOISF.GeographicRegion;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicRegionNameListFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicRegionNameListFR currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicRegionNameListFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicRegionNameListFRIterator theGeographicRegion = (GeographicRegionNameListFRIterator)findAncestorWithClass(this, GeographicRegionNameListFRIterator.class);
			pageContext.getOut().print(theGeographicRegion.getNameListFR());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicRegion for nameListFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicRegion for nameListFR tag ");
		}
		return SKIP_BODY;
	}
}

