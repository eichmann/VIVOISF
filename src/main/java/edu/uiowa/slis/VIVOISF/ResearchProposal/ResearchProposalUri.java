package edu.uiowa.slis.VIVOISF.ResearchProposal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearchProposalUri extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearchProposalUri currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearchProposalUri.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResearchProposalUriIterator theResearchProposal = (ResearchProposalUriIterator)findAncestorWithClass(this, ResearchProposalUriIterator.class);
			pageContext.getOut().print(theResearchProposal.getUri());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearchProposal for uri tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearchProposal for uri tag ");
		}
		return SKIP_BODY;
	}
}

