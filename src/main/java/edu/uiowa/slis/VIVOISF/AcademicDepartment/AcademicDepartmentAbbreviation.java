package edu.uiowa.slis.VIVOISF.AcademicDepartment;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicDepartmentAbbreviation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicDepartmentAbbreviation currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicDepartmentAbbreviation.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			AcademicDepartment theAcademicDepartment = (AcademicDepartment)findAncestorWithClass(this, AcademicDepartment.class);
			if (!theAcademicDepartment.commitNeeded) {
				pageContext.getOut().print(theAcademicDepartment.getAbbreviation());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicDepartment for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicDepartment for abbreviation tag ");
		}
		return SKIP_BODY;
	}

	public String getAbbreviation() throws JspTagException {
		try {
			AcademicDepartment theAcademicDepartment = (AcademicDepartment)findAncestorWithClass(this, AcademicDepartment.class);
			return theAcademicDepartment.getAbbreviation();
		} catch (Exception e) {
			log.error(" Can't find enclosing AcademicDepartment for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicDepartment for abbreviation tag ");
		}
	}

	public void setAbbreviation(String abbreviation) throws JspTagException {
		try {
			AcademicDepartment theAcademicDepartment = (AcademicDepartment)findAncestorWithClass(this, AcademicDepartment.class);
			theAcademicDepartment.setAbbreviation(abbreviation);
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicDepartment for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicDepartment for abbreviation tag ");
		}
	}
}

