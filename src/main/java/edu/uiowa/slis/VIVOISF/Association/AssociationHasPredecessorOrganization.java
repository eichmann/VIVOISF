package edu.uiowa.slis.VIVOISF.Association;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AssociationHasPredecessorOrganization extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AssociationHasPredecessorOrganization currentInstance = null;
	private static final Log log = LogFactory.getLog(AssociationHasPredecessorOrganization.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AssociationHasPredecessorOrganizationIterator theAssociationHasPredecessorOrganizationIterator = (AssociationHasPredecessorOrganizationIterator)findAncestorWithClass(this, AssociationHasPredecessorOrganizationIterator.class);
			pageContext.getOut().print(theAssociationHasPredecessorOrganizationIterator.getHasPredecessorOrganization());
		} catch (Exception e) {
			log.error("Can't find enclosing Association for hasPredecessorOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing Association for hasPredecessorOrganization tag ");
		}
		return SKIP_BODY;
	}
}

