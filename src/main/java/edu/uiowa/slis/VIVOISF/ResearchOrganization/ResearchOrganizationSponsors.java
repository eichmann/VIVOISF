package edu.uiowa.slis.VIVOISF.ResearchOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearchOrganizationSponsors extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearchOrganizationSponsors currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearchOrganizationSponsors.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ResearchOrganizationSponsorsIterator theResearchOrganizationSponsorsIterator = (ResearchOrganizationSponsorsIterator)findAncestorWithClass(this, ResearchOrganizationSponsorsIterator.class);
			pageContext.getOut().print(theResearchOrganizationSponsorsIterator.getSponsors());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearchOrganization for sponsors tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearchOrganization for sponsors tag ");
		}
		return SKIP_BODY;
	}
}

