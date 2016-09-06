package edu.uiowa.slis.VIVOISF.Department;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DepartmentERO_0000031Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DepartmentERO_0000031Type currentInstance = null;
	private static final Log log = LogFactory.getLog(DepartmentERO_0000031Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DepartmentERO_0000031Iterator theDepartmentERO_0000031Iterator = (DepartmentERO_0000031Iterator)findAncestorWithClass(this, DepartmentERO_0000031Iterator.class);
			pageContext.getOut().print(theDepartmentERO_0000031Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Department for ERO_0000031 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Department for ERO_0000031 tag ");
		}
		return SKIP_BODY;
	}
}

