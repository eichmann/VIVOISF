package edu.uiowa.slis.VIVOISF.LegalDecision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDecisionReversedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDecisionReversedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDecisionReversedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegalDecisionReversedByIterator theLegalDecisionReversedByIterator = (LegalDecisionReversedByIterator)findAncestorWithClass(this, LegalDecisionReversedByIterator.class);
			pageContext.getOut().print(theLegalDecisionReversedByIterator.getReversedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDecision for reversedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDecision for reversedBy tag ");
		}
		return SKIP_BODY;
	}
}

