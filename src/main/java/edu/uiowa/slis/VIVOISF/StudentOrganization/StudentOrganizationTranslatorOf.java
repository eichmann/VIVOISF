package edu.uiowa.slis.VIVOISF.StudentOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StudentOrganizationTranslatorOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StudentOrganizationTranslatorOf currentInstance = null;
	private static final Log log = LogFactory.getLog(StudentOrganizationTranslatorOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StudentOrganizationTranslatorOfIterator theStudentOrganizationTranslatorOfIterator = (StudentOrganizationTranslatorOfIterator)findAncestorWithClass(this, StudentOrganizationTranslatorOfIterator.class);
			pageContext.getOut().print(theStudentOrganizationTranslatorOfIterator.getTranslatorOf());
		} catch (Exception e) {
			log.error("Can't find enclosing StudentOrganization for translatorOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing StudentOrganization for translatorOf tag ");
		}
		return SKIP_BODY;
	}
}

