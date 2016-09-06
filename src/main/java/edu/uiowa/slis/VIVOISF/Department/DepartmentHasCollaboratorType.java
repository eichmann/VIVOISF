package edu.uiowa.slis.VIVOISF.Department;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DepartmentHasCollaboratorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DepartmentHasCollaboratorType currentInstance = null;
	private static final Log log = LogFactory.getLog(DepartmentHasCollaboratorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DepartmentHasCollaboratorIterator theDepartmentHasCollaboratorIterator = (DepartmentHasCollaboratorIterator)findAncestorWithClass(this, DepartmentHasCollaboratorIterator.class);
			pageContext.getOut().print(theDepartmentHasCollaboratorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Department for hasCollaborator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Department for hasCollaborator tag ");
		}
		return SKIP_BODY;
	}
}

