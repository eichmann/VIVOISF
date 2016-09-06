package edu.uiowa.slis.VIVOISF.AcademicDepartment;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicDepartmentOverview extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicDepartmentOverview currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicDepartmentOverview.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			AcademicDepartment theAcademicDepartment = (AcademicDepartment)findAncestorWithClass(this, AcademicDepartment.class);
			if (!theAcademicDepartment.commitNeeded) {
				pageContext.getOut().print(theAcademicDepartment.getOverview());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicDepartment for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicDepartment for overview tag ");
		}
		return SKIP_BODY;
	}

	public String getOverview() throws JspTagException {
		try {
			AcademicDepartment theAcademicDepartment = (AcademicDepartment)findAncestorWithClass(this, AcademicDepartment.class);
			return theAcademicDepartment.getOverview();
		} catch (Exception e) {
			log.error(" Can't find enclosing AcademicDepartment for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicDepartment for overview tag ");
		}
	}

	public void setOverview(String overview) throws JspTagException {
		try {
			AcademicDepartment theAcademicDepartment = (AcademicDepartment)findAncestorWithClass(this, AcademicDepartment.class);
			theAcademicDepartment.setOverview(overview);
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicDepartment for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicDepartment for overview tag ");
		}
	}
}

