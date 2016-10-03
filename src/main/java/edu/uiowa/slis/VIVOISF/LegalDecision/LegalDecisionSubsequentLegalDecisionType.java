package edu.uiowa.slis.VIVOISF.LegalDecision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDecisionSubsequentLegalDecisionType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDecisionSubsequentLegalDecisionType currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDecisionSubsequentLegalDecisionType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegalDecisionSubsequentLegalDecisionIterator theLegalDecisionSubsequentLegalDecisionIterator = (LegalDecisionSubsequentLegalDecisionIterator)findAncestorWithClass(this, LegalDecisionSubsequentLegalDecisionIterator.class);
			pageContext.getOut().print(theLegalDecisionSubsequentLegalDecisionIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDecision for subsequentLegalDecision tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDecision for subsequentLegalDecision tag ");
		}
		return SKIP_BODY;
	}
}

