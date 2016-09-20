package edu.uiowa.slis.VIVOISF.Association;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AssociationAffiliatedOrganizationInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AssociationAffiliatedOrganizationInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(AssociationAffiliatedOrganizationInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AssociationAffiliatedOrganizationInverseIterator theAssociationAffiliatedOrganizationInverseIterator = (AssociationAffiliatedOrganizationInverseIterator)findAncestorWithClass(this, AssociationAffiliatedOrganizationInverseIterator.class);
			pageContext.getOut().print(theAssociationAffiliatedOrganizationInverseIterator.getAffiliatedOrganizationInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Association for affiliatedOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing Association for affiliatedOrganization tag ");
		}
		return SKIP_BODY;
	}
}

