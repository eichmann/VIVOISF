package edu.uiowa.slis.VIVOISF.AcademicDepartment;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicDepartmentPublisherOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicDepartmentPublisherOf currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicDepartmentPublisherOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AcademicDepartmentPublisherOfIterator theAcademicDepartmentPublisherOfIterator = (AcademicDepartmentPublisherOfIterator)findAncestorWithClass(this, AcademicDepartmentPublisherOfIterator.class);
			pageContext.getOut().print(theAcademicDepartmentPublisherOfIterator.getPublisherOf());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicDepartment for publisherOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicDepartment for publisherOf tag ");
		}
		return SKIP_BODY;
	}
}

