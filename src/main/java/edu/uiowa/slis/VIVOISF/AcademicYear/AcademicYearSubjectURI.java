package edu.uiowa.slis.VIVOISF.AcademicYear;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicYearSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicYearSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicYearSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			AcademicYear theAcademicYear = (AcademicYear)findAncestorWithClass(this, AcademicYear.class);
			if (!theAcademicYear.commitNeeded) {
				pageContext.getOut().print(theAcademicYear.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicYear for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicYear for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			AcademicYear theAcademicYear = (AcademicYear)findAncestorWithClass(this, AcademicYear.class);
			return theAcademicYear.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing AcademicYear for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicYear for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			AcademicYear theAcademicYear = (AcademicYear)findAncestorWithClass(this, AcademicYear.class);
			theAcademicYear.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicYear for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicYear for subjectURI tag ");
		}
	}
}

