package edu.uiowa.slis.VIVOISF.Department;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DepartmentAssigneeForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DepartmentAssigneeForType currentInstance = null;
	private static final Log log = LogFactory.getLog(DepartmentAssigneeForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DepartmentAssigneeForIterator theDepartmentAssigneeForIterator = (DepartmentAssigneeForIterator)findAncestorWithClass(this, DepartmentAssigneeForIterator.class);
			pageContext.getOut().print(theDepartmentAssigneeForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Department for assigneeFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Department for assigneeFor tag ");
		}
		return SKIP_BODY;
	}
}

