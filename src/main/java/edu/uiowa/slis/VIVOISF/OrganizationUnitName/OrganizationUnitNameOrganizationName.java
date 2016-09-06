package edu.uiowa.slis.VIVOISF.OrganizationUnitName;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationUnitNameOrganizationName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationUnitNameOrganizationName currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationUnitNameOrganizationName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OrganizationUnitNameOrganizationNameIterator theOrganizationUnitName = (OrganizationUnitNameOrganizationNameIterator)findAncestorWithClass(this, OrganizationUnitNameOrganizationNameIterator.class);
			pageContext.getOut().print(theOrganizationUnitName.getOrganizationName());
		} catch (Exception e) {
			log.error("Can't find enclosing OrganizationUnitName for organizationName tag ", e);
			throw new JspTagException("Error: Can't find enclosing OrganizationUnitName for organizationName tag ");
		}
		return SKIP_BODY;
	}
}

