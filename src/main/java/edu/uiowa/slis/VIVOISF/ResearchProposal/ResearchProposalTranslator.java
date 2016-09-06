package edu.uiowa.slis.VIVOISF.ResearchProposal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearchProposalTranslator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearchProposalTranslator currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearchProposalTranslator.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ResearchProposalTranslatorIterator theResearchProposalTranslatorIterator = (ResearchProposalTranslatorIterator)findAncestorWithClass(this, ResearchProposalTranslatorIterator.class);
			pageContext.getOut().print(theResearchProposalTranslatorIterator.getTranslator());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearchProposal for translator tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearchProposal for translator tag ");
		}
		return SKIP_BODY;
	}
}

