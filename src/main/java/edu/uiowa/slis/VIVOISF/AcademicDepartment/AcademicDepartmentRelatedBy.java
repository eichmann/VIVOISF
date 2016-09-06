package edu.uiowa.slis.VIVOISF.AcademicDepartment;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicDepartmentRelatedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicDepartmentRelatedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicDepartmentRelatedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AcademicDepartmentRelatedByIterator theAcademicDepartmentRelatedByIterator = (AcademicDepartmentRelatedByIterator)findAncestorWithClass(this, AcademicDepartmentRelatedByIterator.class);
			pageContext.getOut().print(theAcademicDepartmentRelatedByIterator.getRelatedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicDepartment for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicDepartment for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

