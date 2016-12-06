package edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicPositionAbbreviation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicPositionAbbreviation currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicPositionAbbreviation.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicPosition theNonFacultyAcademicPosition = (NonFacultyAcademicPosition)findAncestorWithClass(this, NonFacultyAcademicPosition.class);
			if (!theNonFacultyAcademicPosition.commitNeeded) {
				pageContext.getOut().print(theNonFacultyAcademicPosition.getAbbreviation());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademicPosition for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademicPosition for abbreviation tag ");
		}
		return SKIP_BODY;
	}

	public String getAbbreviation() throws JspTagException {
		try {
			NonFacultyAcademicPosition theNonFacultyAcademicPosition = (NonFacultyAcademicPosition)findAncestorWithClass(this, NonFacultyAcademicPosition.class);
			return theNonFacultyAcademicPosition.getAbbreviation();
		} catch (Exception e) {
			log.error(" Can't find enclosing NonFacultyAcademicPosition for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademicPosition for abbreviation tag ");
		}
	}

	public void setAbbreviation(String abbreviation) throws JspTagException {
		try {
			NonFacultyAcademicPosition theNonFacultyAcademicPosition = (NonFacultyAcademicPosition)findAncestorWithClass(this, NonFacultyAcademicPosition.class);
			theNonFacultyAcademicPosition.setAbbreviation(abbreviation);
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademicPosition for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademicPosition for abbreviation tag ");
		}
	}
}

