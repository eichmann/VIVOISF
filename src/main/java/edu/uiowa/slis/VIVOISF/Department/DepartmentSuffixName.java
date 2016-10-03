package edu.uiowa.slis.VIVOISF.Department;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DepartmentSuffixName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DepartmentSuffixName currentInstance = null;
	private static final Log log = LogFactory.getLog(DepartmentSuffixName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DepartmentSuffixNameIterator theDepartment = (DepartmentSuffixNameIterator)findAncestorWithClass(this, DepartmentSuffixNameIterator.class);
			pageContext.getOut().print(theDepartment.getSuffixName());
		} catch (Exception e) {
			log.error("Can't find enclosing Department for suffixName tag ", e);
			throw new JspTagException("Error: Can't find enclosing Department for suffixName tag ");
		}
		return SKIP_BODY;
	}
}

