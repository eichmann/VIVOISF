package edu.uiowa.slis.VIVOISF.Department;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DepartmentHasCollaboratorInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DepartmentHasCollaboratorInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(DepartmentHasCollaboratorInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DepartmentHasCollaboratorInverseIterator theDepartmentHasCollaboratorInverseIterator = (DepartmentHasCollaboratorInverseIterator)findAncestorWithClass(this, DepartmentHasCollaboratorInverseIterator.class);
			pageContext.getOut().print(theDepartmentHasCollaboratorInverseIterator.getHasCollaboratorInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Department for hasCollaborator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Department for hasCollaborator tag ");
		}
		return SKIP_BODY;
	}
}

