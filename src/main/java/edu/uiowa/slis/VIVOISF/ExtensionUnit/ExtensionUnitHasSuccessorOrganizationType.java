package edu.uiowa.slis.VIVOISF.ExtensionUnit;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ExtensionUnitHasSuccessorOrganizationType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ExtensionUnitHasSuccessorOrganizationType currentInstance = null;
	private static final Log log = LogFactory.getLog(ExtensionUnitHasSuccessorOrganizationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ExtensionUnitHasSuccessorOrganizationIterator theExtensionUnitHasSuccessorOrganizationIterator = (ExtensionUnitHasSuccessorOrganizationIterator)findAncestorWithClass(this, ExtensionUnitHasSuccessorOrganizationIterator.class);
			pageContext.getOut().print(theExtensionUnitHasSuccessorOrganizationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ExtensionUnit for hasSuccessorOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing ExtensionUnit for hasSuccessorOrganization tag ");
		}
		return SKIP_BODY;
	}
}

