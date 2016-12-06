package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationNationalityIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationNationalityIT currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationNationalityIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OrganizationNationalityITIterator theOrganization = (OrganizationNationalityITIterator)findAncestorWithClass(this, OrganizationNationalityITIterator.class);
			pageContext.getOut().print(theOrganization.getNationalityIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for nationalityIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for nationalityIT tag ");
		}
		return SKIP_BODY;
	}
}

