package edu.uiowa.slis.VIVOISF.Department;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DepartmentOBI_0000304InverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DepartmentOBI_0000304InverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(DepartmentOBI_0000304InverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DepartmentOBI_0000304InverseIterator theDepartmentOBI_0000304InverseIterator = (DepartmentOBI_0000304InverseIterator)findAncestorWithClass(this, DepartmentOBI_0000304InverseIterator.class);
			pageContext.getOut().print(theDepartmentOBI_0000304InverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Department for OBI_0000304 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Department for OBI_0000304 tag ");
		}
		return SKIP_BODY;
	}
}

