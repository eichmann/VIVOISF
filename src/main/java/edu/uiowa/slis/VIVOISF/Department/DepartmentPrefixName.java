package edu.uiowa.slis.VIVOISF.Department;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DepartmentPrefixName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DepartmentPrefixName currentInstance = null;
	private static final Log log = LogFactory.getLog(DepartmentPrefixName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DepartmentPrefixNameIterator theDepartment = (DepartmentPrefixNameIterator)findAncestorWithClass(this, DepartmentPrefixNameIterator.class);
			pageContext.getOut().print(theDepartment.getPrefixName());
		} catch (Exception e) {
			log.error("Can't find enclosing Department for prefixName tag ", e);
			throw new JspTagException("Error: Can't find enclosing Department for prefixName tag ");
		}
		return SKIP_BODY;
	}
}

