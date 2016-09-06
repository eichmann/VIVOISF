package edu.uiowa.slis.VIVOISF.ExtensionUnit;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ExtensionUnitHasPredecessorOrganization extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ExtensionUnitHasPredecessorOrganization currentInstance = null;
	private static final Log log = LogFactory.getLog(ExtensionUnitHasPredecessorOrganization.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ExtensionUnitHasPredecessorOrganizationIterator theExtensionUnitHasPredecessorOrganizationIterator = (ExtensionUnitHasPredecessorOrganizationIterator)findAncestorWithClass(this, ExtensionUnitHasPredecessorOrganizationIterator.class);
			pageContext.getOut().print(theExtensionUnitHasPredecessorOrganizationIterator.getHasPredecessorOrganization());
		} catch (Exception e) {
			log.error("Can't find enclosing ExtensionUnit for hasPredecessorOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing ExtensionUnit for hasPredecessorOrganization tag ");
		}
		return SKIP_BODY;
	}
}

