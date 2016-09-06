package edu.uiowa.slis.VIVOISF.AcademicDepartment;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicDepartmentLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicDepartmentLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicDepartmentLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			AcademicDepartment theAcademicDepartment = (AcademicDepartment)findAncestorWithClass(this, AcademicDepartment.class);
			if (!theAcademicDepartment.commitNeeded) {
				pageContext.getOut().print(theAcademicDepartment.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicDepartment for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicDepartment for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			AcademicDepartment theAcademicDepartment = (AcademicDepartment)findAncestorWithClass(this, AcademicDepartment.class);
			return theAcademicDepartment.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing AcademicDepartment for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicDepartment for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			AcademicDepartment theAcademicDepartment = (AcademicDepartment)findAncestorWithClass(this, AcademicDepartment.class);
			theAcademicDepartment.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicDepartment for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicDepartment for label tag ");
		}
	}
}

