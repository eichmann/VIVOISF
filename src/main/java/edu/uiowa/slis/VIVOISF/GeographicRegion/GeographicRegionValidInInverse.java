package edu.uiowa.slis.VIVOISF.GeographicRegion;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicRegionValidInInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicRegionValidInInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicRegionValidInInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GeographicRegionValidInInverseIterator theGeographicRegionValidInInverseIterator = (GeographicRegionValidInInverseIterator)findAncestorWithClass(this, GeographicRegionValidInInverseIterator.class);
			pageContext.getOut().print(theGeographicRegionValidInInverseIterator.getValidInInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicRegion for validIn tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicRegion for validIn tag ");
		}
		return SKIP_BODY;
	}
}

