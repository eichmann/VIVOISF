package edu.uiowa.slis.VIVOISF.ResearchProposal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearchProposalTranscriptOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearchProposalTranscriptOf currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearchProposalTranscriptOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ResearchProposalTranscriptOfIterator theResearchProposalTranscriptOfIterator = (ResearchProposalTranscriptOfIterator)findAncestorWithClass(this, ResearchProposalTranscriptOfIterator.class);
			pageContext.getOut().print(theResearchProposalTranscriptOfIterator.getTranscriptOf());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearchProposal for transcriptOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearchProposal for transcriptOf tag ");
		}
		return SKIP_BODY;
	}
}

