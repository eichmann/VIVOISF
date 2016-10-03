package edu.uiowa.slis.VIVOISF.ResearchOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearchOrganizationPrefixName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearchOrganizationPrefixName currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearchOrganizationPrefixName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResearchOrganizationPrefixNameIterator theResearchOrganization = (ResearchOrganizationPrefixNameIterator)findAncestorWithClass(this, ResearchOrganizationPrefixNameIterator.class);
			pageContext.getOut().print(theResearchOrganization.getPrefixName());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearchOrganization for prefixName tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearchOrganization for prefixName tag ");
		}
		return SKIP_BODY;
	}
}

