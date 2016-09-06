package edu.uiowa.slis.VIVOISF.ResearchProposal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearchProposalSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearchProposalSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearchProposalSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			ResearchProposal theResearchProposal = (ResearchProposal)findAncestorWithClass(this, ResearchProposal.class);
			if (!theResearchProposal.commitNeeded) {
				pageContext.getOut().print(theResearchProposal.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing ResearchProposal for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearchProposal for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			ResearchProposal theResearchProposal = (ResearchProposal)findAncestorWithClass(this, ResearchProposal.class);
			return theResearchProposal.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing ResearchProposal for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearchProposal for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			ResearchProposal theResearchProposal = (ResearchProposal)findAncestorWithClass(this, ResearchProposal.class);
			theResearchProposal.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing ResearchProposal for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearchProposal for subjectURI tag ");
		}
	}
}

