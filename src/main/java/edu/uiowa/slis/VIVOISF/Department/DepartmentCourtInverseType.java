package edu.uiowa.slis.VIVOISF.Department;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DepartmentCourtInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DepartmentCourtInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(DepartmentCourtInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DepartmentCourtInverseIterator theDepartmentCourtInverseIterator = (DepartmentCourtInverseIterator)findAncestorWithClass(this, DepartmentCourtInverseIterator.class);
			pageContext.getOut().print(theDepartmentCourtInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Department for court tag ", e);
			throw new JspTagException("Error: Can't find enclosing Department for court tag ");
		}
		return SKIP_BODY;
	}
}

