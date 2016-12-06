package edu.uiowa.slis.VIVOISF.GeographicRegion;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicRegionPlaceOfPublication extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicRegionPlaceOfPublication currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicRegionPlaceOfPublication.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			GeographicRegion theGeographicRegion = (GeographicRegion)findAncestorWithClass(this, GeographicRegion.class);
			if (!theGeographicRegion.commitNeeded) {
				pageContext.getOut().print(theGeographicRegion.getPlaceOfPublication());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicRegion for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicRegion for placeOfPublication tag ");
		}
		return SKIP_BODY;
	}

	public String getPlaceOfPublication() throws JspTagException {
		try {
			GeographicRegion theGeographicRegion = (GeographicRegion)findAncestorWithClass(this, GeographicRegion.class);
			return theGeographicRegion.getPlaceOfPublication();
		} catch (Exception e) {
			log.error(" Can't find enclosing GeographicRegion for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicRegion for placeOfPublication tag ");
		}
	}

	public void setPlaceOfPublication(String placeOfPublication) throws JspTagException {
		try {
			GeographicRegion theGeographicRegion = (GeographicRegion)findAncestorWithClass(this, GeographicRegion.class);
			theGeographicRegion.setPlaceOfPublication(placeOfPublication);
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicRegion for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicRegion for placeOfPublication tag ");
		}
	}
}

