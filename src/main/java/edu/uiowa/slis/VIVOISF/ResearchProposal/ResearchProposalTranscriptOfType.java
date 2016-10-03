package edu.uiowa.slis.VIVOISF.ResearchProposal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearchProposalTranscriptOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearchProposalTranscriptOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearchProposalTranscriptOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ResearchProposalTranscriptOfIterator theResearchProposalTranscriptOfIterator = (ResearchProposalTranscriptOfIterator)findAncestorWithClass(this, ResearchProposalTranscriptOfIterator.class);
			pageContext.getOut().print(theResearchProposalTranscriptOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearchProposal for transcriptOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearchProposal for transcriptOf tag ");
		}
		return SKIP_BODY;
	}
}

