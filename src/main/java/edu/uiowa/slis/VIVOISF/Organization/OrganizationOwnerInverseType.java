package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationOwnerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationOwnerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationOwnerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OrganizationOwnerInverseIterator theOrganizationOwnerInverseIterator = (OrganizationOwnerInverseIterator)findAncestorWithClass(this, OrganizationOwnerInverseIterator.class);
			pageContext.getOut().print(theOrganizationOwnerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for owner tag ");
		}
		return SKIP_BODY;
	}
}

