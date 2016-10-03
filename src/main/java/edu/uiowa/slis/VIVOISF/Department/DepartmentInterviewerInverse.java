package edu.uiowa.slis.VIVOISF.Department;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DepartmentInterviewerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DepartmentInterviewerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(DepartmentInterviewerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DepartmentInterviewerInverseIterator theDepartmentInterviewerInverseIterator = (DepartmentInterviewerInverseIterator)findAncestorWithClass(this, DepartmentInterviewerInverseIterator.class);
			pageContext.getOut().print(theDepartmentInterviewerInverseIterator.getInterviewerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Department for interviewer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Department for interviewer tag ");
		}
		return SKIP_BODY;
	}
}

