package edu.uiowa.slis.VIVOISF.NonAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicPositionAbbreviation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicPositionAbbreviation currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicPositionAbbreviation.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			NonAcademicPosition theNonAcademicPosition = (NonAcademicPosition)findAncestorWithClass(this, NonAcademicPosition.class);
			if (!theNonAcademicPosition.commitNeeded) {
				pageContext.getOut().print(theNonAcademicPosition.getAbbreviation());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademicPosition for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademicPosition for abbreviation tag ");
		}
		return SKIP_BODY;
	}

	public String getAbbreviation() throws JspTagException {
		try {
			NonAcademicPosition theNonAcademicPosition = (NonAcademicPosition)findAncestorWithClass(this, NonAcademicPosition.class);
			return theNonAcademicPosition.getAbbreviation();
		} catch (Exception e) {
			log.error(" Can't find enclosing NonAcademicPosition for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademicPosition for abbreviation tag ");
		}
	}

	public void setAbbreviation(String abbreviation) throws JspTagException {
		try {
			NonAcademicPosition theNonAcademicPosition = (NonAcademicPosition)findAncestorWithClass(this, NonAcademicPosition.class);
			theNonAcademicPosition.setAbbreviation(abbreviation);
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademicPosition for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademicPosition for abbreviation tag ");
		}
	}
}

