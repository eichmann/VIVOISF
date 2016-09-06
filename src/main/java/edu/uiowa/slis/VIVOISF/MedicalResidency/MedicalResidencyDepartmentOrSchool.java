package edu.uiowa.slis.VIVOISF.MedicalResidency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MedicalResidencyDepartmentOrSchool extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MedicalResidencyDepartmentOrSchool currentInstance = null;
	private static final Log log = LogFactory.getLog(MedicalResidencyDepartmentOrSchool.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			MedicalResidencyDepartmentOrSchoolIterator theMedicalResidency = (MedicalResidencyDepartmentOrSchoolIterator)findAncestorWithClass(this, MedicalResidencyDepartmentOrSchoolIterator.class);
			pageContext.getOut().print(theMedicalResidency.getDepartmentOrSchool());
		} catch (Exception e) {
			log.error("Can't find enclosing MedicalResidency for departmentOrSchool tag ", e);
			throw new JspTagException("Error: Can't find enclosing MedicalResidency for departmentOrSchool tag ");
		}
		return SKIP_BODY;
	}
}

