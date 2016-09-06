package edu.uiowa.slis.VIVOISF.AcademicDepartment;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicDepartmentERO_0000031Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicDepartmentERO_0000031Type currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicDepartmentERO_0000031Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AcademicDepartmentERO_0000031Iterator theAcademicDepartmentERO_0000031Iterator = (AcademicDepartmentERO_0000031Iterator)findAncestorWithClass(this, AcademicDepartmentERO_0000031Iterator.class);
			pageContext.getOut().print(theAcademicDepartmentERO_0000031Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicDepartment for ERO_0000031 tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicDepartment for ERO_0000031 tag ");
		}
		return SKIP_BODY;
	}
}

