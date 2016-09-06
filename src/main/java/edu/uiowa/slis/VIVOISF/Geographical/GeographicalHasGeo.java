package edu.uiowa.slis.VIVOISF.Geographical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicalHasGeo extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicalHasGeo currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicalHasGeo.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GeographicalHasGeoIterator theGeographicalHasGeoIterator = (GeographicalHasGeoIterator)findAncestorWithClass(this, GeographicalHasGeoIterator.class);
			pageContext.getOut().print(theGeographicalHasGeoIterator.getHasGeo());
		} catch (Exception e) {
			log.error("Can't find enclosing Geographical for hasGeo tag ", e);
			throw new JspTagException("Error: Can't find enclosing Geographical for hasGeo tag ");
		}
		return SKIP_BODY;
	}
}

