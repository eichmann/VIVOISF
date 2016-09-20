package edu.uiowa.slis.VIVOISF.ResearchProposal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearchProposalERO_0000045 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearchProposalERO_0000045 currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearchProposalERO_0000045.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResearchProposalERO_0000045Iterator theResearchProposal = (ResearchProposalERO_0000045Iterator)findAncestorWithClass(this, ResearchProposalERO_0000045Iterator.class);
			pageContext.getOut().print(theResearchProposal.getERO_0000045());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearchProposal for ERO_0000045 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearchProposal for ERO_0000045 tag ");
		}
		return SKIP_BODY;
	}
}

