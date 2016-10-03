package edu.uiowa.slis.VIVOISF.LegalDecision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDecisionAffirmedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDecisionAffirmedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDecisionAffirmedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegalDecisionAffirmedByIterator theLegalDecisionAffirmedByIterator = (LegalDecisionAffirmedByIterator)findAncestorWithClass(this, LegalDecisionAffirmedByIterator.class);
			pageContext.getOut().print(theLegalDecisionAffirmedByIterator.getAffirmedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDecision for affirmedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDecision for affirmedBy tag ");
		}
		return SKIP_BODY;
	}
}

