package edu.uiowa.slis.VIVOISF.AcademicDepartment;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicDepartmentCourtInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicDepartmentCourtInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicDepartmentCourtInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AcademicDepartmentCourtInverseIterator theAcademicDepartmentCourtInverseIterator = (AcademicDepartmentCourtInverseIterator)findAncestorWithClass(this, AcademicDepartmentCourtInverseIterator.class);
			pageContext.getOut().print(theAcademicDepartmentCourtInverseIterator.getCourtInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicDepartment for court tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicDepartment for court tag ");
		}
		return SKIP_BODY;
	}
}

