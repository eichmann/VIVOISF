package edu.uiowa.slis.VIVOISF.ResearchProposal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearchProposalFeaturesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearchProposalFeaturesType currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearchProposalFeaturesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ResearchProposalFeaturesIterator theResearchProposalFeaturesIterator = (ResearchProposalFeaturesIterator)findAncestorWithClass(this, ResearchProposalFeaturesIterator.class);
			pageContext.getOut().print(theResearchProposalFeaturesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearchProposal for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearchProposal for features tag ");
		}
		return SKIP_BODY;
	}
}

