package edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyAdministrativePositionPlaceOfPublication extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyAdministrativePositionPlaceOfPublication currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyAdministrativePositionPlaceOfPublication.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			FacultyAdministrativePosition theFacultyAdministrativePosition = (FacultyAdministrativePosition)findAncestorWithClass(this, FacultyAdministrativePosition.class);
			if (!theFacultyAdministrativePosition.commitNeeded) {
				pageContext.getOut().print(theFacultyAdministrativePosition.getPlaceOfPublication());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyAdministrativePosition for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyAdministrativePosition for placeOfPublication tag ");
		}
		return SKIP_BODY;
	}

	public String getPlaceOfPublication() throws JspTagException {
		try {
			FacultyAdministrativePosition theFacultyAdministrativePosition = (FacultyAdministrativePosition)findAncestorWithClass(this, FacultyAdministrativePosition.class);
			return theFacultyAdministrativePosition.getPlaceOfPublication();
		} catch (Exception e) {
			log.error(" Can't find enclosing FacultyAdministrativePosition for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyAdministrativePosition for placeOfPublication tag ");
		}
	}

	public void setPlaceOfPublication(String placeOfPublication) throws JspTagException {
		try {
			FacultyAdministrativePosition theFacultyAdministrativePosition = (FacultyAdministrativePosition)findAncestorWithClass(this, FacultyAdministrativePosition.class);
			theFacultyAdministrativePosition.setPlaceOfPublication(placeOfPublication);
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyAdministrativePosition for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyAdministrativePosition for placeOfPublication tag ");
		}
	}
}

