package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationIssuerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationIssuerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationIssuerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OrganizationIssuerInverseIterator theOrganizationIssuerInverseIterator = (OrganizationIssuerInverseIterator)findAncestorWithClass(this, OrganizationIssuerInverseIterator.class);
			pageContext.getOut().print(theOrganizationIssuerInverseIterator.getIssuerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for issuer tag ");
		}
		return SKIP_BODY;
	}
}

