package edu.uiowa.slis.VIVOISF.AcademicDepartment;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicDepartmentProducerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicDepartmentProducerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicDepartmentProducerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AcademicDepartmentProducerInverseIterator theAcademicDepartmentProducerInverseIterator = (AcademicDepartmentProducerInverseIterator)findAncestorWithClass(this, AcademicDepartmentProducerInverseIterator.class);
			pageContext.getOut().print(theAcademicDepartmentProducerInverseIterator.getProducerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicDepartment for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicDepartment for producer tag ");
		}
		return SKIP_BODY;
	}
}

