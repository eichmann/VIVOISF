package edu.uiowa.slis.VIVOISF.ResearchOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearchOrganizationIntervieweeInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearchOrganizationIntervieweeInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearchOrganizationIntervieweeInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ResearchOrganizationIntervieweeInverseIterator theResearchOrganizationIntervieweeInverseIterator = (ResearchOrganizationIntervieweeInverseIterator)findAncestorWithClass(this, ResearchOrganizationIntervieweeInverseIterator.class);
			pageContext.getOut().print(theResearchOrganizationIntervieweeInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearchOrganization for interviewee tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearchOrganization for interviewee tag ");
		}
		return SKIP_BODY;
	}
}

