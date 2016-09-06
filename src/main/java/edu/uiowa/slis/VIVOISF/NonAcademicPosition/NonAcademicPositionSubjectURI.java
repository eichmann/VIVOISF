package edu.uiowa.slis.VIVOISF.NonAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicPositionSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicPositionSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicPositionSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			NonAcademicPosition theNonAcademicPosition = (NonAcademicPosition)findAncestorWithClass(this, NonAcademicPosition.class);
			if (!theNonAcademicPosition.commitNeeded) {
				pageContext.getOut().print(theNonAcademicPosition.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademicPosition for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademicPosition for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			NonAcademicPosition theNonAcademicPosition = (NonAcademicPosition)findAncestorWithClass(this, NonAcademicPosition.class);
			return theNonAcademicPosition.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing NonAcademicPosition for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademicPosition for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			NonAcademicPosition theNonAcademicPosition = (NonAcademicPosition)findAncestorWithClass(this, NonAcademicPosition.class);
			theNonAcademicPosition.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademicPosition for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademicPosition for subjectURI tag ");
		}
	}
}

