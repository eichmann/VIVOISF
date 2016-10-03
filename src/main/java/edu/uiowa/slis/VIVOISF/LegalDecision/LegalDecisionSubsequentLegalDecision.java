package edu.uiowa.slis.VIVOISF.LegalDecision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDecisionSubsequentLegalDecision extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDecisionSubsequentLegalDecision currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDecisionSubsequentLegalDecision.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegalDecisionSubsequentLegalDecisionIterator theLegalDecisionSubsequentLegalDecisionIterator = (LegalDecisionSubsequentLegalDecisionIterator)findAncestorWithClass(this, LegalDecisionSubsequentLegalDecisionIterator.class);
			pageContext.getOut().print(theLegalDecisionSubsequentLegalDecisionIterator.getSubsequentLegalDecision());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDecision for subsequentLegalDecision tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDecision for subsequentLegalDecision tag ");
		}
		return SKIP_BODY;
	}
}

