package edu.uiowa.slis.VIVOISF.GeographicLocation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicLocationLandAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicLocationLandAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicLocationLandAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicLocationLandAreaTotalIterator theGeographicLocation = (GeographicLocationLandAreaTotalIterator)findAncestorWithClass(this, GeographicLocationLandAreaTotalIterator.class);
			pageContext.getOut().print(theGeographicLocation.getLandAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicLocation for landAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicLocation for landAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

