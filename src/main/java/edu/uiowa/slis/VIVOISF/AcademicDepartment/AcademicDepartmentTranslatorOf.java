package edu.uiowa.slis.VIVOISF.AcademicDepartment;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicDepartmentTranslatorOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicDepartmentTranslatorOf currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicDepartmentTranslatorOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AcademicDepartmentTranslatorOfIterator theAcademicDepartmentTranslatorOfIterator = (AcademicDepartmentTranslatorOfIterator)findAncestorWithClass(this, AcademicDepartmentTranslatorOfIterator.class);
			pageContext.getOut().print(theAcademicDepartmentTranslatorOfIterator.getTranslatorOf());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicDepartment for translatorOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicDepartment for translatorOf tag ");
		}
		return SKIP_BODY;
	}
}

