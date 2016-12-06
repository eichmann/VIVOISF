package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationHasResearchArea extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationHasResearchArea currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationHasResearchArea.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OrganizationHasResearchAreaIterator theOrganizationHasResearchAreaIterator = (OrganizationHasResearchAreaIterator)findAncestorWithClass(this, OrganizationHasResearchAreaIterator.class);
			pageContext.getOut().print(theOrganizationHasResearchAreaIterator.getHasResearchArea());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for hasResearchArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for hasResearchArea tag ");
		}
		return SKIP_BODY;
	}
}

