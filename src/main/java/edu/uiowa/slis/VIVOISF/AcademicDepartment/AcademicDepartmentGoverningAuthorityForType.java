package edu.uiowa.slis.VIVOISF.AcademicDepartment;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicDepartmentGoverningAuthorityForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicDepartmentGoverningAuthorityForType currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicDepartmentGoverningAuthorityForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AcademicDepartmentGoverningAuthorityForIterator theAcademicDepartmentGoverningAuthorityForIterator = (AcademicDepartmentGoverningAuthorityForIterator)findAncestorWithClass(this, AcademicDepartmentGoverningAuthorityForIterator.class);
			pageContext.getOut().print(theAcademicDepartmentGoverningAuthorityForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicDepartment for governingAuthorityFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicDepartment for governingAuthorityFor tag ");
		}
		return SKIP_BODY;
	}
}

