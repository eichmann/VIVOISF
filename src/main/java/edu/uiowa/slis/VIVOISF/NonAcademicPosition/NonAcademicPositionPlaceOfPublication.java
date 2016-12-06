package edu.uiowa.slis.VIVOISF.NonAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicPositionPlaceOfPublication extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicPositionPlaceOfPublication currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicPositionPlaceOfPublication.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			NonAcademicPosition theNonAcademicPosition = (NonAcademicPosition)findAncestorWithClass(this, NonAcademicPosition.class);
			if (!theNonAcademicPosition.commitNeeded) {
				pageContext.getOut().print(theNonAcademicPosition.getPlaceOfPublication());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademicPosition for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademicPosition for placeOfPublication tag ");
		}
		return SKIP_BODY;
	}

	public String getPlaceOfPublication() throws JspTagException {
		try {
			NonAcademicPosition theNonAcademicPosition = (NonAcademicPosition)findAncestorWithClass(this, NonAcademicPosition.class);
			return theNonAcademicPosition.getPlaceOfPublication();
		} catch (Exception e) {
			log.error(" Can't find enclosing NonAcademicPosition for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademicPosition for placeOfPublication tag ");
		}
	}

	public void setPlaceOfPublication(String placeOfPublication) throws JspTagException {
		try {
			NonAcademicPosition theNonAcademicPosition = (NonAcademicPosition)findAncestorWithClass(this, NonAcademicPosition.class);
			theNonAcademicPosition.setPlaceOfPublication(placeOfPublication);
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademicPosition for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademicPosition for placeOfPublication tag ");
		}
	}
}

