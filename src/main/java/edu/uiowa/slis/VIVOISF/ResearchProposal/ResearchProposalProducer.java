package edu.uiowa.slis.VIVOISF.ResearchProposal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearchProposalProducer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearchProposalProducer currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearchProposalProducer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ResearchProposalProducerIterator theResearchProposalProducerIterator = (ResearchProposalProducerIterator)findAncestorWithClass(this, ResearchProposalProducerIterator.class);
			pageContext.getOut().print(theResearchProposalProducerIterator.getProducer());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearchProposal for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearchProposal for producer tag ");
		}
		return SKIP_BODY;
	}
}

