package edu.uiowa.slis.VIVOISF.Department;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DepartmentRO_0000056Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DepartmentRO_0000056Type currentInstance = null;
	private static final Log log = LogFactory.getLog(DepartmentRO_0000056Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DepartmentRO_0000056Iterator theDepartmentRO_0000056Iterator = (DepartmentRO_0000056Iterator)findAncestorWithClass(this, DepartmentRO_0000056Iterator.class);
			pageContext.getOut().print(theDepartmentRO_0000056Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Department for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Department for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

