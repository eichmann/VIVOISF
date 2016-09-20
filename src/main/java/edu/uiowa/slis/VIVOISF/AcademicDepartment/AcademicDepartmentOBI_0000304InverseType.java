package edu.uiowa.slis.VIVOISF.AcademicDepartment;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicDepartmentOBI_0000304InverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicDepartmentOBI_0000304InverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicDepartmentOBI_0000304InverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AcademicDepartmentOBI_0000304InverseIterator theAcademicDepartmentOBI_0000304InverseIterator = (AcademicDepartmentOBI_0000304InverseIterator)findAncestorWithClass(this, AcademicDepartmentOBI_0000304InverseIterator.class);
			pageContext.getOut().print(theAcademicDepartmentOBI_0000304InverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicDepartment for OBI_0000304 tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicDepartment for OBI_0000304 tag ");
		}
		return SKIP_BODY;
	}
}

