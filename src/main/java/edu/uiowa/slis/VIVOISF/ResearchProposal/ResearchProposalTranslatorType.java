package edu.uiowa.slis.VIVOISF.ResearchProposal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearchProposalTranslatorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearchProposalTranslatorType currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearchProposalTranslatorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ResearchProposalTranslatorIterator theResearchProposalTranslatorIterator = (ResearchProposalTranslatorIterator)findAncestorWithClass(this, ResearchProposalTranslatorIterator.class);
			pageContext.getOut().print(theResearchProposalTranslatorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearchProposal for translator tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearchProposal for translator tag ");
		}
		return SKIP_BODY;
	}
}

