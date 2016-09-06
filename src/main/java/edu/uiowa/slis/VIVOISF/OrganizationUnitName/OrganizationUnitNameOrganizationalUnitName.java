package edu.uiowa.slis.VIVOISF.OrganizationUnitName;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationUnitNameOrganizationalUnitName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationUnitNameOrganizationalUnitName currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationUnitNameOrganizationalUnitName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OrganizationUnitNameOrganizationalUnitNameIterator theOrganizationUnitName = (OrganizationUnitNameOrganizationalUnitNameIterator)findAncestorWithClass(this, OrganizationUnitNameOrganizationalUnitNameIterator.class);
			pageContext.getOut().print(theOrganizationUnitName.getOrganizationalUnitName());
		} catch (Exception e) {
			log.error("Can't find enclosing OrganizationUnitName for organizationalUnitName tag ", e);
			throw new JspTagException("Error: Can't find enclosing OrganizationUnitName for organizationalUnitName tag ");
		}
		return SKIP_BODY;
	}
}

