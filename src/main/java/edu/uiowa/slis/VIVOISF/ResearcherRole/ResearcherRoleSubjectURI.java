package edu.uiowa.slis.VIVOISF.ResearcherRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearcherRoleSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearcherRoleSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearcherRoleSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			ResearcherRole theResearcherRole = (ResearcherRole)findAncestorWithClass(this, ResearcherRole.class);
			if (!theResearcherRole.commitNeeded) {
				pageContext.getOut().print(theResearcherRole.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherRole for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearcherRole for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			ResearcherRole theResearcherRole = (ResearcherRole)findAncestorWithClass(this, ResearcherRole.class);
			return theResearcherRole.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing ResearcherRole for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearcherRole for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			ResearcherRole theResearcherRole = (ResearcherRole)findAncestorWithClass(this, ResearcherRole.class);
			theResearcherRole.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherRole for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearcherRole for subjectURI tag ");
		}
	}
}

