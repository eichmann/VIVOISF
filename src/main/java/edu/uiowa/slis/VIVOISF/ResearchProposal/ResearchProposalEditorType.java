package edu.uiowa.slis.VIVOISF.ResearchProposal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearchProposalEditorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearchProposalEditorType currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearchProposalEditorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ResearchProposalEditorIterator theResearchProposalEditorIterator = (ResearchProposalEditorIterator)findAncestorWithClass(this, ResearchProposalEditorIterator.class);
			pageContext.getOut().print(theResearchProposalEditorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearchProposal for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearchProposal for editor tag ");
		}
		return SKIP_BODY;
	}
}

