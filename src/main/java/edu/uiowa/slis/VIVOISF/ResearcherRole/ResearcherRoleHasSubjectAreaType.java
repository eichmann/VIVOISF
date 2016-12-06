package edu.uiowa.slis.VIVOISF.ResearcherRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearcherRoleHasSubjectAreaType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearcherRoleHasSubjectAreaType currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearcherRoleHasSubjectAreaType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ResearcherRoleHasSubjectAreaIterator theResearcherRoleHasSubjectAreaIterator = (ResearcherRoleHasSubjectAreaIterator)findAncestorWithClass(this, ResearcherRoleHasSubjectAreaIterator.class);
			pageContext.getOut().print(theResearcherRoleHasSubjectAreaIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherRole for hasSubjectArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearcherRole for hasSubjectArea tag ");
		}
		return SKIP_BODY;
	}
}

