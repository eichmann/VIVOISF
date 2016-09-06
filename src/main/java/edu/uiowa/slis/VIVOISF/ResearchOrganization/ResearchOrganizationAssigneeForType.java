package edu.uiowa.slis.VIVOISF.ResearchOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearchOrganizationAssigneeForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearchOrganizationAssigneeForType currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearchOrganizationAssigneeForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ResearchOrganizationAssigneeForIterator theResearchOrganizationAssigneeForIterator = (ResearchOrganizationAssigneeForIterator)findAncestorWithClass(this, ResearchOrganizationAssigneeForIterator.class);
			pageContext.getOut().print(theResearchOrganizationAssigneeForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearchOrganization for assigneeFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearchOrganization for assigneeFor tag ");
		}
		return SKIP_BODY;
	}
}

