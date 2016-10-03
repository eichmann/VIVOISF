package edu.uiowa.slis.VIVOISF.Department;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DepartmentDirectorInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DepartmentDirectorInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(DepartmentDirectorInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DepartmentDirectorInverseIterator theDepartmentDirectorInverseIterator = (DepartmentDirectorInverseIterator)findAncestorWithClass(this, DepartmentDirectorInverseIterator.class);
			pageContext.getOut().print(theDepartmentDirectorInverseIterator.getDirectorInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Department for director tag ", e);
			throw new JspTagException("Error: Can't find enclosing Department for director tag ");
		}
		return SKIP_BODY;
	}
}

