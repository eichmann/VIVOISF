package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationNationalityRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationNationalityRU currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationNationalityRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OrganizationNationalityRUIterator theOrganization = (OrganizationNationalityRUIterator)findAncestorWithClass(this, OrganizationNationalityRUIterator.class);
			pageContext.getOut().print(theOrganization.getNationalityRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for nationalityRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for nationalityRU tag ");
		}
		return SKIP_BODY;
	}
}

