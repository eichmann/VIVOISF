package edu.uiowa.slis.VIVOISF.ResearchProposal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearchProposalContent extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearchProposalContent currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearchProposalContent.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResearchProposalContentIterator theResearchProposal = (ResearchProposalContentIterator)findAncestorWithClass(this, ResearchProposalContentIterator.class);
			pageContext.getOut().print(theResearchProposal.getContent());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearchProposal for content tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearchProposal for content tag ");
		}
		return SKIP_BODY;
	}
}

