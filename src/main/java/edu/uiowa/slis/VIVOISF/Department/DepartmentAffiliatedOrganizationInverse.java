package edu.uiowa.slis.VIVOISF.Department;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DepartmentAffiliatedOrganizationInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DepartmentAffiliatedOrganizationInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(DepartmentAffiliatedOrganizationInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DepartmentAffiliatedOrganizationInverseIterator theDepartmentAffiliatedOrganizationInverseIterator = (DepartmentAffiliatedOrganizationInverseIterator)findAncestorWithClass(this, DepartmentAffiliatedOrganizationInverseIterator.class);
			pageContext.getOut().print(theDepartmentAffiliatedOrganizationInverseIterator.getAffiliatedOrganizationInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Department for affiliatedOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing Department for affiliatedOrganization tag ");
		}
		return SKIP_BODY;
	}
}

