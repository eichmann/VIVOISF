package edu.uiowa.slis.VIVOISF.Department;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DepartmentIntervieweeType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DepartmentIntervieweeType currentInstance = null;
	private static final Log log = LogFactory.getLog(DepartmentIntervieweeType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DepartmentIntervieweeIterator theDepartmentIntervieweeIterator = (DepartmentIntervieweeIterator)findAncestorWithClass(this, DepartmentIntervieweeIterator.class);
			pageContext.getOut().print(theDepartmentIntervieweeIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Department for interviewee tag ", e);
			throw new JspTagException("Error: Can't find enclosing Department for interviewee tag ");
		}
		return SKIP_BODY;
	}
}

