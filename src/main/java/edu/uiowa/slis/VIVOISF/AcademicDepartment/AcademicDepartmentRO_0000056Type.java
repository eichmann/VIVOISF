package edu.uiowa.slis.VIVOISF.AcademicDepartment;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicDepartmentRO_0000056Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicDepartmentRO_0000056Type currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicDepartmentRO_0000056Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AcademicDepartmentRO_0000056Iterator theAcademicDepartmentRO_0000056Iterator = (AcademicDepartmentRO_0000056Iterator)findAncestorWithClass(this, AcademicDepartmentRO_0000056Iterator.class);
			pageContext.getOut().print(theAcademicDepartmentRO_0000056Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicDepartment for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicDepartment for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

