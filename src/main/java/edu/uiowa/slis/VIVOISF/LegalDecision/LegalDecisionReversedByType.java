package edu.uiowa.slis.VIVOISF.LegalDecision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDecisionReversedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDecisionReversedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDecisionReversedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegalDecisionReversedByIterator theLegalDecisionReversedByIterator = (LegalDecisionReversedByIterator)findAncestorWithClass(this, LegalDecisionReversedByIterator.class);
			pageContext.getOut().print(theLegalDecisionReversedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDecision for reversedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDecision for reversedBy tag ");
		}
		return SKIP_BODY;
	}
}

