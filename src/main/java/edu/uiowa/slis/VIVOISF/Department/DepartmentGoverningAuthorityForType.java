package edu.uiowa.slis.VIVOISF.Department;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DepartmentGoverningAuthorityForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DepartmentGoverningAuthorityForType currentInstance = null;
	private static final Log log = LogFactory.getLog(DepartmentGoverningAuthorityForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DepartmentGoverningAuthorityForIterator theDepartmentGoverningAuthorityForIterator = (DepartmentGoverningAuthorityForIterator)findAncestorWithClass(this, DepartmentGoverningAuthorityForIterator.class);
			pageContext.getOut().print(theDepartmentGoverningAuthorityForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Department for governingAuthorityFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Department for governingAuthorityFor tag ");
		}
		return SKIP_BODY;
	}
}

