package edu.uiowa.slis.VIVOISF.Department;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DepartmentDirectorInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DepartmentDirectorInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(DepartmentDirectorInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DepartmentDirectorInverseIterator theDepartmentDirectorInverseIterator = (DepartmentDirectorInverseIterator)findAncestorWithClass(this, DepartmentDirectorInverseIterator.class);
			pageContext.getOut().print(theDepartmentDirectorInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Department for director tag ", e);
			throw new JspTagException("Error: Can't find enclosing Department for director tag ");
		}
		return SKIP_BODY;
	}
}

