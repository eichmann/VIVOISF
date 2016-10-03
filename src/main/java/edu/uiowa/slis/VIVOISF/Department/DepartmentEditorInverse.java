package edu.uiowa.slis.VIVOISF.Department;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DepartmentEditorInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DepartmentEditorInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(DepartmentEditorInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DepartmentEditorInverseIterator theDepartmentEditorInverseIterator = (DepartmentEditorInverseIterator)findAncestorWithClass(this, DepartmentEditorInverseIterator.class);
			pageContext.getOut().print(theDepartmentEditorInverseIterator.getEditorInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Department for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Department for editor tag ");
		}
		return SKIP_BODY;
	}
}

