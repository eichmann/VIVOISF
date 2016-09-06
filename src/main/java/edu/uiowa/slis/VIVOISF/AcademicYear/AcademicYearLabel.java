package edu.uiowa.slis.VIVOISF.AcademicYear;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicYearLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicYearLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicYearLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			AcademicYear theAcademicYear = (AcademicYear)findAncestorWithClass(this, AcademicYear.class);
			if (!theAcademicYear.commitNeeded) {
				pageContext.getOut().print(theAcademicYear.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicYear for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicYear for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			AcademicYear theAcademicYear = (AcademicYear)findAncestorWithClass(this, AcademicYear.class);
			return theAcademicYear.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing AcademicYear for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicYear for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			AcademicYear theAcademicYear = (AcademicYear)findAncestorWithClass(this, AcademicYear.class);
			theAcademicYear.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicYear for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicYear for label tag ");
		}
	}
}

