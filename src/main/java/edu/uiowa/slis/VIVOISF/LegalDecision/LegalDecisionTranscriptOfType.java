package edu.uiowa.slis.VIVOISF.LegalDecision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDecisionTranscriptOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDecisionTranscriptOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDecisionTranscriptOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegalDecisionTranscriptOfIterator theLegalDecisionTranscriptOfIterator = (LegalDecisionTranscriptOfIterator)findAncestorWithClass(this, LegalDecisionTranscriptOfIterator.class);
			pageContext.getOut().print(theLegalDecisionTranscriptOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDecision for transcriptOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDecision for transcriptOf tag ");
		}
		return SKIP_BODY;
	}
}

