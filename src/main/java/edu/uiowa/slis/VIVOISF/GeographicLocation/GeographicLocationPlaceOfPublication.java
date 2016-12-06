package edu.uiowa.slis.VIVOISF.GeographicLocation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicLocationPlaceOfPublication extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicLocationPlaceOfPublication currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicLocationPlaceOfPublication.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			GeographicLocation theGeographicLocation = (GeographicLocation)findAncestorWithClass(this, GeographicLocation.class);
			if (!theGeographicLocation.commitNeeded) {
				pageContext.getOut().print(theGeographicLocation.getPlaceOfPublication());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicLocation for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicLocation for placeOfPublication tag ");
		}
		return SKIP_BODY;
	}

	public String getPlaceOfPublication() throws JspTagException {
		try {
			GeographicLocation theGeographicLocation = (GeographicLocation)findAncestorWithClass(this, GeographicLocation.class);
			return theGeographicLocation.getPlaceOfPublication();
		} catch (Exception e) {
			log.error(" Can't find enclosing GeographicLocation for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicLocation for placeOfPublication tag ");
		}
	}

	public void setPlaceOfPublication(String placeOfPublication) throws JspTagException {
		try {
			GeographicLocation theGeographicLocation = (GeographicLocation)findAncestorWithClass(this, GeographicLocation.class);
			theGeographicLocation.setPlaceOfPublication(placeOfPublication);
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicLocation for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicLocation for placeOfPublication tag ");
		}
	}
}

