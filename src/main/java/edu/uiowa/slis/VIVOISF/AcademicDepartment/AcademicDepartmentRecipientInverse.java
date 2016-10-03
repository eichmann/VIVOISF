package edu.uiowa.slis.VIVOISF.AcademicDepartment;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicDepartmentRecipientInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicDepartmentRecipientInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicDepartmentRecipientInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AcademicDepartmentRecipientInverseIterator theAcademicDepartmentRecipientInverseIterator = (AcademicDepartmentRecipientInverseIterator)findAncestorWithClass(this, AcademicDepartmentRecipientInverseIterator.class);
			pageContext.getOut().print(theAcademicDepartmentRecipientInverseIterator.getRecipientInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicDepartment for recipient tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicDepartment for recipient tag ");
		}
		return SKIP_BODY;
	}
}

