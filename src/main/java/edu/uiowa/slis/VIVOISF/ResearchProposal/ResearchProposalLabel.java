package edu.uiowa.slis.VIVOISF.ResearchProposal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearchProposalLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearchProposalLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearchProposalLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			ResearchProposal theResearchProposal = (ResearchProposal)findAncestorWithClass(this, ResearchProposal.class);
			if (!theResearchProposal.commitNeeded) {
				pageContext.getOut().print(theResearchProposal.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing ResearchProposal for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearchProposal for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			ResearchProposal theResearchProposal = (ResearchProposal)findAncestorWithClass(this, ResearchProposal.class);
			return theResearchProposal.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing ResearchProposal for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearchProposal for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			ResearchProposal theResearchProposal = (ResearchProposal)findAncestorWithClass(this, ResearchProposal.class);
			theResearchProposal.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing ResearchProposal for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearchProposal for label tag ");
		}
	}
}

