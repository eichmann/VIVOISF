package edu.uiowa.slis.VIVOISF.AcademicDepartment;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicDepartmentOwnerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicDepartmentOwnerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicDepartmentOwnerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AcademicDepartmentOwnerInverseIterator theAcademicDepartmentOwnerInverseIterator = (AcademicDepartmentOwnerInverseIterator)findAncestorWithClass(this, AcademicDepartmentOwnerInverseIterator.class);
			pageContext.getOut().print(theAcademicDepartmentOwnerInverseIterator.getOwnerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicDepartment for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicDepartment for owner tag ");
		}
		return SKIP_BODY;
	}
}

