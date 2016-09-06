package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationHasPredecessorOrganizationType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationHasPredecessorOrganizationType currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationHasPredecessorOrganizationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OrganizationHasPredecessorOrganizationIterator theOrganizationHasPredecessorOrganizationIterator = (OrganizationHasPredecessorOrganizationIterator)findAncestorWithClass(this, OrganizationHasPredecessorOrganizationIterator.class);
			pageContext.getOut().print(theOrganizationHasPredecessorOrganizationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for hasPredecessorOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for hasPredecessorOrganization tag ");
		}
		return SKIP_BODY;
	}
}

