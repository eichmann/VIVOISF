package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationNationalityZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationNationalityZH currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationNationalityZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OrganizationNationalityZHIterator theOrganization = (OrganizationNationalityZHIterator)findAncestorWithClass(this, OrganizationNationalityZHIterator.class);
			pageContext.getOut().print(theOrganization.getNationalityZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for nationalityZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for nationalityZH tag ");
		}
		return SKIP_BODY;
	}
}

