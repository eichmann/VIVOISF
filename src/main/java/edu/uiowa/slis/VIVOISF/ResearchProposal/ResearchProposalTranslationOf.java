package edu.uiowa.slis.VIVOISF.ResearchProposal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearchProposalTranslationOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearchProposalTranslationOf currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearchProposalTranslationOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ResearchProposalTranslationOfIterator theResearchProposalTranslationOfIterator = (ResearchProposalTranslationOfIterator)findAncestorWithClass(this, ResearchProposalTranslationOfIterator.class);
			pageContext.getOut().print(theResearchProposalTranslationOfIterator.getTranslationOf());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearchProposal for translationOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearchProposal for translationOf tag ");
		}
		return SKIP_BODY;
	}
}

