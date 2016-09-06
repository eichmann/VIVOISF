package edu.uiowa.slis.VIVOISF.Department;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DepartmentAffiliatedOrganizationType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DepartmentAffiliatedOrganizationType currentInstance = null;
	private static final Log log = LogFactory.getLog(DepartmentAffiliatedOrganizationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DepartmentAffiliatedOrganizationIterator theDepartmentAffiliatedOrganizationIterator = (DepartmentAffiliatedOrganizationIterator)findAncestorWithClass(this, DepartmentAffiliatedOrganizationIterator.class);
			pageContext.getOut().print(theDepartmentAffiliatedOrganizationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Department for affiliatedOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing Department for affiliatedOrganization tag ");
		}
		return SKIP_BODY;
	}
}

