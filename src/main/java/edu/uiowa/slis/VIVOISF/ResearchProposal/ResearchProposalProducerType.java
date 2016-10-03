package edu.uiowa.slis.VIVOISF.ResearchProposal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearchProposalProducerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearchProposalProducerType currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearchProposalProducerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ResearchProposalProducerIterator theResearchProposalProducerIterator = (ResearchProposalProducerIterator)findAncestorWithClass(this, ResearchProposalProducerIterator.class);
			pageContext.getOut().print(theResearchProposalProducerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearchProposal for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearchProposal for producer tag ");
		}
		return SKIP_BODY;
	}
}

