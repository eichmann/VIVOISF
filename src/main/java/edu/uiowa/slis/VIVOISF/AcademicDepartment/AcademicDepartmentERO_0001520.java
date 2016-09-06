package edu.uiowa.slis.VIVOISF.AcademicDepartment;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicDepartmentERO_0001520 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicDepartmentERO_0001520 currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicDepartmentERO_0001520.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AcademicDepartmentERO_0001520Iterator theAcademicDepartmentERO_0001520Iterator = (AcademicDepartmentERO_0001520Iterator)findAncestorWithClass(this, AcademicDepartmentERO_0001520Iterator.class);
			pageContext.getOut().print(theAcademicDepartmentERO_0001520Iterator.getERO_0001520());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicDepartment for ERO_0001520 tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicDepartment for ERO_0001520 tag ");
		}
		return SKIP_BODY;
	}
}

