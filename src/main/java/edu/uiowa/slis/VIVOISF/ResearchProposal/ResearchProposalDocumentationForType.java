package edu.uiowa.slis.VIVOISF.ResearchProposal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearchProposalDocumentationForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearchProposalDocumentationForType currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearchProposalDocumentationForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ResearchProposalDocumentationForIterator theResearchProposalDocumentationForIterator = (ResearchProposalDocumentationForIterator)findAncestorWithClass(this, ResearchProposalDocumentationForIterator.class);
			pageContext.getOut().print(theResearchProposalDocumentationForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearchProposal for documentationFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearchProposal for documentationFor tag ");
		}
		return SKIP_BODY;
	}
}

