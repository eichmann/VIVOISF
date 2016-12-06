package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationNationalityAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationNationalityAR currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationNationalityAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OrganizationNationalityARIterator theOrganization = (OrganizationNationalityARIterator)findAncestorWithClass(this, OrganizationNationalityARIterator.class);
			pageContext.getOut().print(theOrganization.getNationalityAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for nationalityAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for nationalityAR tag ");
		}
		return SKIP_BODY;
	}
}

