package edu.uiowa.slis.VIVOISF.AcademicDepartment;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicDepartmentPerformerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicDepartmentPerformerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicDepartmentPerformerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AcademicDepartmentPerformerInverseIterator theAcademicDepartmentPerformerInverseIterator = (AcademicDepartmentPerformerInverseIterator)findAncestorWithClass(this, AcademicDepartmentPerformerInverseIterator.class);
			pageContext.getOut().print(theAcademicDepartmentPerformerInverseIterator.getPerformerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicDepartment for performer tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicDepartment for performer tag ");
		}
		return SKIP_BODY;
	}
}

