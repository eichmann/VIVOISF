package edu.uiowa.slis.VIVOISF.AcademicDepartment;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicDepartmentSponsors extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicDepartmentSponsors currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicDepartmentSponsors.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AcademicDepartmentSponsorsIterator theAcademicDepartmentSponsorsIterator = (AcademicDepartmentSponsorsIterator)findAncestorWithClass(this, AcademicDepartmentSponsorsIterator.class);
			pageContext.getOut().print(theAcademicDepartmentSponsorsIterator.getSponsors());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicDepartment for sponsors tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicDepartment for sponsors tag ");
		}
		return SKIP_BODY;
	}
}

