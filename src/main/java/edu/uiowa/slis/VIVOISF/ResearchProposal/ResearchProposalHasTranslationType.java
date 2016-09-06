package edu.uiowa.slis.VIVOISF.ResearchProposal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearchProposalHasTranslationType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearchProposalHasTranslationType currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearchProposalHasTranslationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ResearchProposalHasTranslationIterator theResearchProposalHasTranslationIterator = (ResearchProposalHasTranslationIterator)findAncestorWithClass(this, ResearchProposalHasTranslationIterator.class);
			pageContext.getOut().print(theResearchProposalHasTranslationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearchProposal for hasTranslation tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearchProposal for hasTranslation tag ");
		}
		return SKIP_BODY;
	}
}

