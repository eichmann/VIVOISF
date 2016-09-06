package edu.uiowa.slis.VIVOISF.AcademicDepartment;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicDepartmentHasEquipmentType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicDepartmentHasEquipmentType currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicDepartmentHasEquipmentType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AcademicDepartmentHasEquipmentIterator theAcademicDepartmentHasEquipmentIterator = (AcademicDepartmentHasEquipmentIterator)findAncestorWithClass(this, AcademicDepartmentHasEquipmentIterator.class);
			pageContext.getOut().print(theAcademicDepartmentHasEquipmentIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicDepartment for hasEquipment tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicDepartment for hasEquipment tag ");
		}
		return SKIP_BODY;
	}
}

