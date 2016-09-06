package edu.uiowa.slis.VIVOISF.AcademicDepartment;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicDepartmentSponsorsType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicDepartmentSponsorsType currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicDepartmentSponsorsType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AcademicDepartmentSponsorsIterator theAcademicDepartmentSponsorsIterator = (AcademicDepartmentSponsorsIterator)findAncestorWithClass(this, AcademicDepartmentSponsorsIterator.class);
			pageContext.getOut().print(theAcademicDepartmentSponsorsIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicDepartment for sponsors tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicDepartment for sponsors tag ");
		}
		return SKIP_BODY;
	}
}

