package edu.uiowa.slis.VIVOISF.Department;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DepartmentGoverningAuthorityFor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DepartmentGoverningAuthorityFor currentInstance = null;
	private static final Log log = LogFactory.getLog(DepartmentGoverningAuthorityFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DepartmentGoverningAuthorityForIterator theDepartmentGoverningAuthorityForIterator = (DepartmentGoverningAuthorityForIterator)findAncestorWithClass(this, DepartmentGoverningAuthorityForIterator.class);
			pageContext.getOut().print(theDepartmentGoverningAuthorityForIterator.getGoverningAuthorityFor());
		} catch (Exception e) {
			log.error("Can't find enclosing Department for governingAuthorityFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Department for governingAuthorityFor tag ");
		}
		return SKIP_BODY;
	}
}

