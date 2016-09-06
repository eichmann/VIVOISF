package edu.uiowa.slis.VIVOISF.StudentOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StudentOrganizationHasEquipmentType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StudentOrganizationHasEquipmentType currentInstance = null;
	private static final Log log = LogFactory.getLog(StudentOrganizationHasEquipmentType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StudentOrganizationHasEquipmentIterator theStudentOrganizationHasEquipmentIterator = (StudentOrganizationHasEquipmentIterator)findAncestorWithClass(this, StudentOrganizationHasEquipmentIterator.class);
			pageContext.getOut().print(theStudentOrganizationHasEquipmentIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing StudentOrganization for hasEquipment tag ", e);
			throw new JspTagException("Error: Can't find enclosing StudentOrganization for hasEquipment tag ");
		}
		return SKIP_BODY;
	}
}

