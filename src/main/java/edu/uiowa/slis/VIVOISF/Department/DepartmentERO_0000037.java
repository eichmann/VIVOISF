package edu.uiowa.slis.VIVOISF.Department;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DepartmentERO_0000037 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DepartmentERO_0000037 currentInstance = null;
	private static final Log log = LogFactory.getLog(DepartmentERO_0000037.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DepartmentERO_0000037Iterator theDepartmentERO_0000037Iterator = (DepartmentERO_0000037Iterator)findAncestorWithClass(this, DepartmentERO_0000037Iterator.class);
			pageContext.getOut().print(theDepartmentERO_0000037Iterator.getERO_0000037());
		} catch (Exception e) {
			log.error("Can't find enclosing Department for ERO_0000037 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Department for ERO_0000037 tag ");
		}
		return SKIP_BODY;
	}
}

