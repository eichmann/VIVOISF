package edu.uiowa.slis.VIVOISF.ResearchOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearchOrganizationSuffixName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearchOrganizationSuffixName currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearchOrganizationSuffixName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResearchOrganizationSuffixNameIterator theResearchOrganization = (ResearchOrganizationSuffixNameIterator)findAncestorWithClass(this, ResearchOrganizationSuffixNameIterator.class);
			pageContext.getOut().print(theResearchOrganization.getSuffixName());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearchOrganization for suffixName tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearchOrganization for suffixName tag ");
		}
		return SKIP_BODY;
	}
}

