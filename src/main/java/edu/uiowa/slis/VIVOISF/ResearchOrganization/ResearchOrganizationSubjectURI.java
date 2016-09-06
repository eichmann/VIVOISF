package edu.uiowa.slis.VIVOISF.ResearchOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearchOrganizationSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearchOrganizationSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearchOrganizationSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			ResearchOrganization theResearchOrganization = (ResearchOrganization)findAncestorWithClass(this, ResearchOrganization.class);
			if (!theResearchOrganization.commitNeeded) {
				pageContext.getOut().print(theResearchOrganization.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing ResearchOrganization for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearchOrganization for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			ResearchOrganization theResearchOrganization = (ResearchOrganization)findAncestorWithClass(this, ResearchOrganization.class);
			return theResearchOrganization.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing ResearchOrganization for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearchOrganization for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			ResearchOrganization theResearchOrganization = (ResearchOrganization)findAncestorWithClass(this, ResearchOrganization.class);
			theResearchOrganization.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing ResearchOrganization for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearchOrganization for subjectURI tag ");
		}
	}
}

