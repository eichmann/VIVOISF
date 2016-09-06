package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyHasPredecessorOrganization extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyHasPredecessorOrganization currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyHasPredecessorOrganization.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyHasPredecessorOrganizationIterator theGovernmentAgencyHasPredecessorOrganizationIterator = (GovernmentAgencyHasPredecessorOrganizationIterator)findAncestorWithClass(this, GovernmentAgencyHasPredecessorOrganizationIterator.class);
			pageContext.getOut().print(theGovernmentAgencyHasPredecessorOrganizationIterator.getHasPredecessorOrganization());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for hasPredecessorOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for hasPredecessorOrganization tag ");
		}
		return SKIP_BODY;
	}
}

