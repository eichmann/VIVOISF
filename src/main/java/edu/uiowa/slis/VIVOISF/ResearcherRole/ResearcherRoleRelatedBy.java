package edu.uiowa.slis.VIVOISF.ResearcherRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearcherRoleRelatedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearcherRoleRelatedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearcherRoleRelatedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ResearcherRoleRelatedByIterator theResearcherRoleRelatedByIterator = (ResearcherRoleRelatedByIterator)findAncestorWithClass(this, ResearcherRoleRelatedByIterator.class);
			pageContext.getOut().print(theResearcherRoleRelatedByIterator.getRelatedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherRole for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearcherRole for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

