package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationNationalityES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationNationalityES currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationNationalityES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OrganizationNationalityESIterator theOrganization = (OrganizationNationalityESIterator)findAncestorWithClass(this, OrganizationNationalityESIterator.class);
			pageContext.getOut().print(theOrganization.getNationalityES());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for nationalityES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for nationalityES tag ");
		}
		return SKIP_BODY;
	}
}

