package edu.uiowa.slis.VIVOISF.OrganizationUnitName;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationUnitNameHasOrganizationalUnitNameInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationUnitNameHasOrganizationalUnitNameInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationUnitNameHasOrganizationalUnitNameInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OrganizationUnitNameHasOrganizationalUnitNameInverseIterator theOrganizationUnitNameHasOrganizationalUnitNameInverseIterator = (OrganizationUnitNameHasOrganizationalUnitNameInverseIterator)findAncestorWithClass(this, OrganizationUnitNameHasOrganizationalUnitNameInverseIterator.class);
			pageContext.getOut().print(theOrganizationUnitNameHasOrganizationalUnitNameInverseIterator.getHasOrganizationalUnitNameInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing OrganizationUnitName for hasOrganizationalUnitName tag ", e);
			throw new JspTagException("Error: Can't find enclosing OrganizationUnitName for hasOrganizationalUnitName tag ");
		}
		return SKIP_BODY;
	}
}

