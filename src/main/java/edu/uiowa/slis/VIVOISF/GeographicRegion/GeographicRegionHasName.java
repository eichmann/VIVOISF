package edu.uiowa.slis.VIVOISF.GeographicRegion;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicRegionHasName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicRegionHasName currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicRegionHasName.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GeographicRegionHasNameIterator theGeographicRegionHasNameIterator = (GeographicRegionHasNameIterator)findAncestorWithClass(this, GeographicRegionHasNameIterator.class);
			pageContext.getOut().print(theGeographicRegionHasNameIterator.getHasName());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicRegion for hasName tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicRegion for hasName tag ");
		}
		return SKIP_BODY;
	}
}

