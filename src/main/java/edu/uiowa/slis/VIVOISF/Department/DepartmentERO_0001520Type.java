package edu.uiowa.slis.VIVOISF.Department;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DepartmentERO_0001520Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DepartmentERO_0001520Type currentInstance = null;
	private static final Log log = LogFactory.getLog(DepartmentERO_0001520Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DepartmentERO_0001520Iterator theDepartmentERO_0001520Iterator = (DepartmentERO_0001520Iterator)findAncestorWithClass(this, DepartmentERO_0001520Iterator.class);
			pageContext.getOut().print(theDepartmentERO_0001520Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Department for ERO_0001520 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Department for ERO_0001520 tag ");
		}
		return SKIP_BODY;
	}
}

