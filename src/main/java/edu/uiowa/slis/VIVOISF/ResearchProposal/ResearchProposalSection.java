package edu.uiowa.slis.VIVOISF.ResearchProposal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearchProposalSection extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearchProposalSection currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearchProposalSection.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResearchProposalSectionIterator theResearchProposal = (ResearchProposalSectionIterator)findAncestorWithClass(this, ResearchProposalSectionIterator.class);
			pageContext.getOut().print(theResearchProposal.getSection());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearchProposal for section tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearchProposal for section tag ");
		}
		return SKIP_BODY;
	}
}

