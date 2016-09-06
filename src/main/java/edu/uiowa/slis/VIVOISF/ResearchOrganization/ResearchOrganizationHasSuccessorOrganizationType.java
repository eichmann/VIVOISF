package edu.uiowa.slis.VIVOISF.ResearchOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearchOrganizationHasSuccessorOrganizationType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearchOrganizationHasSuccessorOrganizationType currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearchOrganizationHasSuccessorOrganizationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ResearchOrganizationHasSuccessorOrganizationIterator theResearchOrganizationHasSuccessorOrganizationIterator = (ResearchOrganizationHasSuccessorOrganizationIterator)findAncestorWithClass(this, ResearchOrganizationHasSuccessorOrganizationIterator.class);
			pageContext.getOut().print(theResearchOrganizationHasSuccessorOrganizationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearchOrganization for hasSuccessorOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearchOrganization for hasSuccessorOrganization tag ");
		}
		return SKIP_BODY;
	}
}

