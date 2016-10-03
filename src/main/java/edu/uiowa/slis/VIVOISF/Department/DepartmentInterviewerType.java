package edu.uiowa.slis.VIVOISF.Department;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DepartmentInterviewerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DepartmentInterviewerType currentInstance = null;
	private static final Log log = LogFactory.getLog(DepartmentInterviewerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DepartmentInterviewerIterator theDepartmentInterviewerIterator = (DepartmentInterviewerIterator)findAncestorWithClass(this, DepartmentInterviewerIterator.class);
			pageContext.getOut().print(theDepartmentInterviewerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Department for interviewer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Department for interviewer tag ");
		}
		return SKIP_BODY;
	}
}

