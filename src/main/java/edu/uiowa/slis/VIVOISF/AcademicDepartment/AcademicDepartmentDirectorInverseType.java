package edu.uiowa.slis.VIVOISF.AcademicDepartment;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicDepartmentDirectorInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicDepartmentDirectorInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicDepartmentDirectorInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AcademicDepartmentDirectorInverseIterator theAcademicDepartmentDirectorInverseIterator = (AcademicDepartmentDirectorInverseIterator)findAncestorWithClass(this, AcademicDepartmentDirectorInverseIterator.class);
			pageContext.getOut().print(theAcademicDepartmentDirectorInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicDepartment for director tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicDepartment for director tag ");
		}
		return SKIP_BODY;
	}
}

