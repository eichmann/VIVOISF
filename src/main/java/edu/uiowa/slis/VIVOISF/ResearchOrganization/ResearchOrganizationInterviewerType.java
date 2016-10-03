package edu.uiowa.slis.VIVOISF.ResearchOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearchOrganizationInterviewerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearchOrganizationInterviewerType currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearchOrganizationInterviewerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ResearchOrganizationInterviewerIterator theResearchOrganizationInterviewerIterator = (ResearchOrganizationInterviewerIterator)findAncestorWithClass(this, ResearchOrganizationInterviewerIterator.class);
			pageContext.getOut().print(theResearchOrganizationInterviewerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearchOrganization for interviewer tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearchOrganization for interviewer tag ");
		}
		return SKIP_BODY;
	}
}

