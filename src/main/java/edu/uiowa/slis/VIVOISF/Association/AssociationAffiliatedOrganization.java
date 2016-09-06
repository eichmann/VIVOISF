package edu.uiowa.slis.VIVOISF.Association;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AssociationAffiliatedOrganization extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AssociationAffiliatedOrganization currentInstance = null;
	private static final Log log = LogFactory.getLog(AssociationAffiliatedOrganization.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AssociationAffiliatedOrganizationIterator theAssociationAffiliatedOrganizationIterator = (AssociationAffiliatedOrganizationIterator)findAncestorWithClass(this, AssociationAffiliatedOrganizationIterator.class);
			pageContext.getOut().print(theAssociationAffiliatedOrganizationIterator.getAffiliatedOrganization());
		} catch (Exception e) {
			log.error("Can't find enclosing Association for affiliatedOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing Association for affiliatedOrganization tag ");
		}
		return SKIP_BODY;
	}
}

