package edu.uiowa.slis.VIVOISF.LegalDecision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDecisionSubsequentLegalDecisionInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDecisionSubsequentLegalDecisionInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDecisionSubsequentLegalDecisionInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegalDecisionSubsequentLegalDecisionInverseIterator theLegalDecisionSubsequentLegalDecisionInverseIterator = (LegalDecisionSubsequentLegalDecisionInverseIterator)findAncestorWithClass(this, LegalDecisionSubsequentLegalDecisionInverseIterator.class);
			pageContext.getOut().print(theLegalDecisionSubsequentLegalDecisionInverseIterator.getSubsequentLegalDecisionInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDecision for subsequentLegalDecision tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDecision for subsequentLegalDecision tag ");
		}
		return SKIP_BODY;
	}
}

