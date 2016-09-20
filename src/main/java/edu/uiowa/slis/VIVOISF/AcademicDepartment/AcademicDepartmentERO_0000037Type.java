package edu.uiowa.slis.VIVOISF.AcademicDepartment;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicDepartmentERO_0000037Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicDepartmentERO_0000037Type currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicDepartmentERO_0000037Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AcademicDepartmentERO_0000037Iterator theAcademicDepartmentERO_0000037Iterator = (AcademicDepartmentERO_0000037Iterator)findAncestorWithClass(this, AcademicDepartmentERO_0000037Iterator.class);
			pageContext.getOut().print(theAcademicDepartmentERO_0000037Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicDepartment for ERO_0000037 tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicDepartment for ERO_0000037 tag ");
		}
		return SKIP_BODY;
	}
}

