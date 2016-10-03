package edu.uiowa.slis.VIVOISF.AcademicDepartment;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicDepartmentPrefixName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicDepartmentPrefixName currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicDepartmentPrefixName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AcademicDepartmentPrefixNameIterator theAcademicDepartment = (AcademicDepartmentPrefixNameIterator)findAncestorWithClass(this, AcademicDepartmentPrefixNameIterator.class);
			pageContext.getOut().print(theAcademicDepartment.getPrefixName());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicDepartment for prefixName tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicDepartment for prefixName tag ");
		}
		return SKIP_BODY;
	}
}

