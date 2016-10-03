package edu.uiowa.slis.VIVOISF.AcademicDepartment;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicDepartmentSuffixName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicDepartmentSuffixName currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicDepartmentSuffixName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AcademicDepartmentSuffixNameIterator theAcademicDepartment = (AcademicDepartmentSuffixNameIterator)findAncestorWithClass(this, AcademicDepartmentSuffixNameIterator.class);
			pageContext.getOut().print(theAcademicDepartment.getSuffixName());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicDepartment for suffixName tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicDepartment for suffixName tag ");
		}
		return SKIP_BODY;
	}
}

