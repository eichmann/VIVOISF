package edu.uiowa.slis.VIVOISF.AcademicDepartment;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicDepartmentIssuerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicDepartmentIssuerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicDepartmentIssuerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AcademicDepartmentIssuerInverseIterator theAcademicDepartmentIssuerInverseIterator = (AcademicDepartmentIssuerInverseIterator)findAncestorWithClass(this, AcademicDepartmentIssuerInverseIterator.class);
			pageContext.getOut().print(theAcademicDepartmentIssuerInverseIterator.getIssuerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicDepartment for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicDepartment for issuer tag ");
		}
		return SKIP_BODY;
	}
}

