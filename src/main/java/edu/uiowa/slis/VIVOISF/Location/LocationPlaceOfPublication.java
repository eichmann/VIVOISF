package edu.uiowa.slis.VIVOISF.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationPlaceOfPublication extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LocationPlaceOfPublication currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationPlaceOfPublication.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Location theLocation = (Location)findAncestorWithClass(this, Location.class);
			if (!theLocation.commitNeeded) {
				pageContext.getOut().print(theLocation.getPlaceOfPublication());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Location for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for placeOfPublication tag ");
		}
		return SKIP_BODY;
	}

	public String getPlaceOfPublication() throws JspTagException {
		try {
			Location theLocation = (Location)findAncestorWithClass(this, Location.class);
			return theLocation.getPlaceOfPublication();
		} catch (Exception e) {
			log.error(" Can't find enclosing Location for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for placeOfPublication tag ");
		}
	}

	public void setPlaceOfPublication(String placeOfPublication) throws JspTagException {
		try {
			Location theLocation = (Location)findAncestorWithClass(this, Location.class);
			theLocation.setPlaceOfPublication(placeOfPublication);
		} catch (Exception e) {
			log.error("Can't find enclosing Location for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for placeOfPublication tag ");
		}
	}
}

