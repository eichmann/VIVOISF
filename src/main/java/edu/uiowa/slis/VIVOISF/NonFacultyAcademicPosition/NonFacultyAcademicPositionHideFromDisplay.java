package edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicPositionHideFromDisplay extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicPositionHideFromDisplay currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicPositionHideFromDisplay.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicPosition theNonFacultyAcademicPosition = (NonFacultyAcademicPosition)findAncestorWithClass(this, NonFacultyAcademicPosition.class);
			if (!theNonFacultyAcademicPosition.commitNeeded) {
				pageContext.getOut().print(theNonFacultyAcademicPosition.getHideFromDisplay());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademicPosition for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademicPosition for hideFromDisplay tag ");
		}
		return SKIP_BODY;
	}

	public String getHideFromDisplay() throws JspTagException {
		try {
			NonFacultyAcademicPosition theNonFacultyAcademicPosition = (NonFacultyAcademicPosition)findAncestorWithClass(this, NonFacultyAcademicPosition.class);
			return theNonFacultyAcademicPosition.getHideFromDisplay();
		} catch (Exception e) {
			log.error(" Can't find enclosing NonFacultyAcademicPosition for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademicPosition for hideFromDisplay tag ");
		}
	}

	public void setHideFromDisplay(String hideFromDisplay) throws JspTagException {
		try {
			NonFacultyAcademicPosition theNonFacultyAcademicPosition = (NonFacultyAcademicPosition)findAncestorWithClass(this, NonFacultyAcademicPosition.class);
			theNonFacultyAcademicPosition.setHideFromDisplay(hideFromDisplay);
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademicPosition for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademicPosition for hideFromDisplay tag ");
		}
	}
}

