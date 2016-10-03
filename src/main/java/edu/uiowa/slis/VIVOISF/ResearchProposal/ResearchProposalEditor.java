package edu.uiowa.slis.VIVOISF.ResearchProposal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearchProposalEditor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearchProposalEditor currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearchProposalEditor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ResearchProposalEditorIterator theResearchProposalEditorIterator = (ResearchProposalEditorIterator)findAncestorWithClass(this, ResearchProposalEditorIterator.class);
			pageContext.getOut().print(theResearchProposalEditorIterator.getEditor());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearchProposal for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearchProposal for editor tag ");
		}
		return SKIP_BODY;
	}
}

