package edu.uiowa.slis.VIVOISF.ResearchOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearchOrganizationInterviewerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearchOrganizationInterviewerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearchOrganizationInterviewerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ResearchOrganizationInterviewerInverseIterator theResearchOrganizationInterviewerInverseIterator = (ResearchOrganizationInterviewerInverseIterator)findAncestorWithClass(this, ResearchOrganizationInterviewerInverseIterator.class);
			pageContext.getOut().print(theResearchOrganizationInterviewerInverseIterator.getInterviewerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearchOrganization for interviewer tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearchOrganization for interviewer tag ");
		}
		return SKIP_BODY;
	}
}

