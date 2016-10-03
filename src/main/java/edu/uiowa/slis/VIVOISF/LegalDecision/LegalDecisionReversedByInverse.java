package edu.uiowa.slis.VIVOISF.LegalDecision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDecisionReversedByInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDecisionReversedByInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDecisionReversedByInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegalDecisionReversedByInverseIterator theLegalDecisionReversedByInverseIterator = (LegalDecisionReversedByInverseIterator)findAncestorWithClass(this, LegalDecisionReversedByInverseIterator.class);
			pageContext.getOut().print(theLegalDecisionReversedByInverseIterator.getReversedByInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDecision for reversedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDecision for reversedBy tag ");
		}
		return SKIP_BODY;
	}
}

