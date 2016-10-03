package edu.uiowa.slis.VIVOISF.ResearchOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearchOrganizationOwnerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearchOrganizationOwnerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearchOrganizationOwnerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ResearchOrganizationOwnerInverseIterator theResearchOrganizationOwnerInverseIterator = (ResearchOrganizationOwnerInverseIterator)findAncestorWithClass(this, ResearchOrganizationOwnerInverseIterator.class);
			pageContext.getOut().print(theResearchOrganizationOwnerInverseIterator.getOwnerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearchOrganization for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearchOrganization for owner tag ");
		}
		return SKIP_BODY;
	}
}

