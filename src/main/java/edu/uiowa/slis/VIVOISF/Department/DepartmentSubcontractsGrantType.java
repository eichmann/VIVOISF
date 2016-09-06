package edu.uiowa.slis.VIVOISF.Department;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DepartmentSubcontractsGrantType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DepartmentSubcontractsGrantType currentInstance = null;
	private static final Log log = LogFactory.getLog(DepartmentSubcontractsGrantType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DepartmentSubcontractsGrantIterator theDepartmentSubcontractsGrantIterator = (DepartmentSubcontractsGrantIterator)findAncestorWithClass(this, DepartmentSubcontractsGrantIterator.class);
			pageContext.getOut().print(theDepartmentSubcontractsGrantIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Department for subcontractsGrant tag ", e);
			throw new JspTagException("Error: Can't find enclosing Department for subcontractsGrant tag ");
		}
		return SKIP_BODY;
	}
}

