package edu.uiowa.slis.VIVOISF.ResearchOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearchOrganizationRelatedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearchOrganizationRelatedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearchOrganizationRelatedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ResearchOrganizationRelatedByIterator theResearchOrganizationRelatedByIterator = (ResearchOrganizationRelatedByIterator)findAncestorWithClass(this, ResearchOrganizationRelatedByIterator.class);
			pageContext.getOut().print(theResearchOrganizationRelatedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearchOrganization for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearchOrganization for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

