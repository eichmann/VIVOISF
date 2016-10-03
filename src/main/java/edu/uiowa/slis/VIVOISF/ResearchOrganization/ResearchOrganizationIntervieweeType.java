package edu.uiowa.slis.VIVOISF.ResearchOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearchOrganizationIntervieweeType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearchOrganizationIntervieweeType currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearchOrganizationIntervieweeType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ResearchOrganizationIntervieweeIterator theResearchOrganizationIntervieweeIterator = (ResearchOrganizationIntervieweeIterator)findAncestorWithClass(this, ResearchOrganizationIntervieweeIterator.class);
			pageContext.getOut().print(theResearchOrganizationIntervieweeIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearchOrganization for interviewee tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearchOrganization for interviewee tag ");
		}
		return SKIP_BODY;
	}
}

