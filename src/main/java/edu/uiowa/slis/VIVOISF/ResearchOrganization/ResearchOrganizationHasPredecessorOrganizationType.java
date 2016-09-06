package edu.uiowa.slis.VIVOISF.ResearchOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearchOrganizationHasPredecessorOrganizationType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearchOrganizationHasPredecessorOrganizationType currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearchOrganizationHasPredecessorOrganizationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ResearchOrganizationHasPredecessorOrganizationIterator theResearchOrganizationHasPredecessorOrganizationIterator = (ResearchOrganizationHasPredecessorOrganizationIterator)findAncestorWithClass(this, ResearchOrganizationHasPredecessorOrganizationIterator.class);
			pageContext.getOut().print(theResearchOrganizationHasPredecessorOrganizationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearchOrganization for hasPredecessorOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearchOrganization for hasPredecessorOrganization tag ");
		}
		return SKIP_BODY;
	}
}

