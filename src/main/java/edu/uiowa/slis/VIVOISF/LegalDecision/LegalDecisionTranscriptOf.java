package edu.uiowa.slis.VIVOISF.LegalDecision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDecisionTranscriptOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDecisionTranscriptOf currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDecisionTranscriptOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegalDecisionTranscriptOfIterator theLegalDecisionTranscriptOfIterator = (LegalDecisionTranscriptOfIterator)findAncestorWithClass(this, LegalDecisionTranscriptOfIterator.class);
			pageContext.getOut().print(theLegalDecisionTranscriptOfIterator.getTranscriptOf());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDecision for transcriptOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDecision for transcriptOf tag ");
		}
		return SKIP_BODY;
	}
}

