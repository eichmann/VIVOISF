package edu.uiowa.slis.VIVOISF.Department;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DepartmentHasSuccessorOrganization extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DepartmentHasSuccessorOrganization currentInstance = null;
	private static final Log log = LogFactory.getLog(DepartmentHasSuccessorOrganization.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DepartmentHasSuccessorOrganizationIterator theDepartmentHasSuccessorOrganizationIterator = (DepartmentHasSuccessorOrganizationIterator)findAncestorWithClass(this, DepartmentHasSuccessorOrganizationIterator.class);
			pageContext.getOut().print(theDepartmentHasSuccessorOrganizationIterator.getHasSuccessorOrganization());
		} catch (Exception e) {
			log.error("Can't find enclosing Department for hasSuccessorOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing Department for hasSuccessorOrganization tag ");
		}
		return SKIP_BODY;
	}
}

