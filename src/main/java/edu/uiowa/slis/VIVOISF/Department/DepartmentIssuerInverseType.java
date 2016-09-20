package edu.uiowa.slis.VIVOISF.Department;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DepartmentIssuerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DepartmentIssuerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(DepartmentIssuerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DepartmentIssuerInverseIterator theDepartmentIssuerInverseIterator = (DepartmentIssuerInverseIterator)findAncestorWithClass(this, DepartmentIssuerInverseIterator.class);
			pageContext.getOut().print(theDepartmentIssuerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Department for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Department for issuer tag ");
		}
		return SKIP_BODY;
	}
}

