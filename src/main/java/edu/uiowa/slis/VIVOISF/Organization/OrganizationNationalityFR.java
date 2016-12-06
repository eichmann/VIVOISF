package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationNationalityFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationNationalityFR currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationNationalityFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OrganizationNationalityFRIterator theOrganization = (OrganizationNationalityFRIterator)findAncestorWithClass(this, OrganizationNationalityFRIterator.class);
			pageContext.getOut().print(theOrganization.getNationalityFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for nationalityFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for nationalityFR tag ");
		}
		return SKIP_BODY;
	}
}

