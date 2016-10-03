package edu.uiowa.slis.VIVOISF.Department;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DepartmentIntervieweeInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DepartmentIntervieweeInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(DepartmentIntervieweeInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DepartmentIntervieweeInverseIterator theDepartmentIntervieweeInverseIterator = (DepartmentIntervieweeInverseIterator)findAncestorWithClass(this, DepartmentIntervieweeInverseIterator.class);
			pageContext.getOut().print(theDepartmentIntervieweeInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Department for interviewee tag ", e);
			throw new JspTagException("Error: Can't find enclosing Department for interviewee tag ");
		}
		return SKIP_BODY;
	}
}

