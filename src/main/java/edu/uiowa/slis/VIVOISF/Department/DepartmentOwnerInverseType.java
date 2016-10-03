package edu.uiowa.slis.VIVOISF.Department;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DepartmentOwnerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DepartmentOwnerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(DepartmentOwnerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DepartmentOwnerInverseIterator theDepartmentOwnerInverseIterator = (DepartmentOwnerInverseIterator)findAncestorWithClass(this, DepartmentOwnerInverseIterator.class);
			pageContext.getOut().print(theDepartmentOwnerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Department for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing Department for owner tag ");
		}
		return SKIP_BODY;
	}
}

