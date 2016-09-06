package edu.uiowa.slis.VIVOISF.ResearchProposal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearchProposalTranslationOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearchProposalTranslationOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearchProposalTranslationOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ResearchProposalTranslationOfIterator theResearchProposalTranslationOfIterator = (ResearchProposalTranslationOfIterator)findAncestorWithClass(this, ResearchProposalTranslationOfIterator.class);
			pageContext.getOut().print(theResearchProposalTranslationOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearchProposal for translationOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearchProposal for translationOf tag ");
		}
		return SKIP_BODY;
	}
}

