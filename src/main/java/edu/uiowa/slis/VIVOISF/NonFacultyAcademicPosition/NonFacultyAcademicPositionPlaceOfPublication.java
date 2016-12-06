package edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicPositionPlaceOfPublication extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicPositionPlaceOfPublication currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicPositionPlaceOfPublication.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicPosition theNonFacultyAcademicPosition = (NonFacultyAcademicPosition)findAncestorWithClass(this, NonFacultyAcademicPosition.class);
			if (!theNonFacultyAcademicPosition.commitNeeded) {
				pageContext.getOut().print(theNonFacultyAcademicPosition.getPlaceOfPublication());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademicPosition for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademicPosition for placeOfPublication tag ");
		}
		return SKIP_BODY;
	}

	public String getPlaceOfPublication() throws JspTagException {
		try {
			NonFacultyAcademicPosition theNonFacultyAcademicPosition = (NonFacultyAcademicPosition)findAncestorWithClass(this, NonFacultyAcademicPosition.class);
			return theNonFacultyAcademicPosition.getPlaceOfPublication();
		} catch (Exception e) {
			log.error(" Can't find enclosing NonFacultyAcademicPosition for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademicPosition for placeOfPublication tag ");
		}
	}

	public void setPlaceOfPublication(String placeOfPublication) throws JspTagException {
		try {
			NonFacultyAcademicPosition theNonFacultyAcademicPosition = (NonFacultyAcademicPosition)findAncestorWithClass(this, NonFacultyAcademicPosition.class);
			theNonFacultyAcademicPosition.setPlaceOfPublication(placeOfPublication);
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademicPosition for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademicPosition for placeOfPublication tag ");
		}
	}
}

