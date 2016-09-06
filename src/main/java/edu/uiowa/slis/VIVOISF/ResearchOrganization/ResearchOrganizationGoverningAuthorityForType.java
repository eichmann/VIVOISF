package edu.uiowa.slis.VIVOISF.ResearchOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearchOrganizationGoverningAuthorityForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearchOrganizationGoverningAuthorityForType currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearchOrganizationGoverningAuthorityForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ResearchOrganizationGoverningAuthorityForIterator theResearchOrganizationGoverningAuthorityForIterator = (ResearchOrganizationGoverningAuthorityForIterator)findAncestorWithClass(this, ResearchOrganizationGoverningAuthorityForIterator.class);
			pageContext.getOut().print(theResearchOrganizationGoverningAuthorityForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearchOrganization for governingAuthorityFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearchOrganization for governingAuthorityFor tag ");
		}
		return SKIP_BODY;
	}
}

