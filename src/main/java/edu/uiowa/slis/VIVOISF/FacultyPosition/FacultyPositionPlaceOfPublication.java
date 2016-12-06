package edu.uiowa.slis.VIVOISF.FacultyPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyPositionPlaceOfPublication extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyPositionPlaceOfPublication currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyPositionPlaceOfPublication.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			FacultyPosition theFacultyPosition = (FacultyPosition)findAncestorWithClass(this, FacultyPosition.class);
			if (!theFacultyPosition.commitNeeded) {
				pageContext.getOut().print(theFacultyPosition.getPlaceOfPublication());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyPosition for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyPosition for placeOfPublication tag ");
		}
		return SKIP_BODY;
	}

	public String getPlaceOfPublication() throws JspTagException {
		try {
			FacultyPosition theFacultyPosition = (FacultyPosition)findAncestorWithClass(this, FacultyPosition.class);
			return theFacultyPosition.getPlaceOfPublication();
		} catch (Exception e) {
			log.error(" Can't find enclosing FacultyPosition for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyPosition for placeOfPublication tag ");
		}
	}

	public void setPlaceOfPublication(String placeOfPublication) throws JspTagException {
		try {
			FacultyPosition theFacultyPosition = (FacultyPosition)findAncestorWithClass(this, FacultyPosition.class);
			theFacultyPosition.setPlaceOfPublication(placeOfPublication);
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyPosition for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyPosition for placeOfPublication tag ");
		}
	}
}

