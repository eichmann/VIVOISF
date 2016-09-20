package edu.uiowa.slis.VIVOISF.ExtensionUnit;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ExtensionUnitAffiliatedOrganizationInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ExtensionUnitAffiliatedOrganizationInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(ExtensionUnitAffiliatedOrganizationInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ExtensionUnitAffiliatedOrganizationInverseIterator theExtensionUnitAffiliatedOrganizationInverseIterator = (ExtensionUnitAffiliatedOrganizationInverseIterator)findAncestorWithClass(this, ExtensionUnitAffiliatedOrganizationInverseIterator.class);
			pageContext.getOut().print(theExtensionUnitAffiliatedOrganizationInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ExtensionUnit for affiliatedOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing ExtensionUnit for affiliatedOrganization tag ");
		}
		return SKIP_BODY;
	}
}

