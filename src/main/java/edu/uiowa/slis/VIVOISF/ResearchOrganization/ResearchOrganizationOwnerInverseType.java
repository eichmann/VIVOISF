package edu.uiowa.slis.VIVOISF.ResearchOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearchOrganizationOwnerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearchOrganizationOwnerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearchOrganizationOwnerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ResearchOrganizationOwnerInverseIterator theResearchOrganizationOwnerInverseIterator = (ResearchOrganizationOwnerInverseIterator)findAncestorWithClass(this, ResearchOrganizationOwnerInverseIterator.class);
			pageContext.getOut().print(theResearchOrganizationOwnerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearchOrganization for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearchOrganization for owner tag ");
		}
		return SKIP_BODY;
	}
}

