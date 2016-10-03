package edu.uiowa.slis.VIVOISF.ResearchProposal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearchProposalIsbn10 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearchProposalIsbn10 currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearchProposalIsbn10.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResearchProposalIsbn10Iterator theResearchProposal = (ResearchProposalIsbn10Iterator)findAncestorWithClass(this, ResearchProposalIsbn10Iterator.class);
			pageContext.getOut().print(theResearchProposal.getIsbn10());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearchProposal for isbn10 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearchProposal for isbn10 tag ");
		}
		return SKIP_BODY;
	}
}

