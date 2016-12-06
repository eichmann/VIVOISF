package edu.uiowa.slis.VIVOISF.GeographicRegion;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicRegionHasAddress extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicRegionHasAddress currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicRegionHasAddress.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GeographicRegionHasAddressIterator theGeographicRegionHasAddressIterator = (GeographicRegionHasAddressIterator)findAncestorWithClass(this, GeographicRegionHasAddressIterator.class);
			pageContext.getOut().print(theGeographicRegionHasAddressIterator.getHasAddress());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicRegion for hasAddress tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicRegion for hasAddress tag ");
		}
		return SKIP_BODY;
	}
}

