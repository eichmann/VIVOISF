package edu.uiowa.slis.VIVOISF.LegalDecision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDecisionAffirmedByInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDecisionAffirmedByInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDecisionAffirmedByInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegalDecisionAffirmedByInverseIterator theLegalDecisionAffirmedByInverseIterator = (LegalDecisionAffirmedByInverseIterator)findAncestorWithClass(this, LegalDecisionAffirmedByInverseIterator.class);
			pageContext.getOut().print(theLegalDecisionAffirmedByInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDecision for affirmedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDecision for affirmedBy tag ");
		}
		return SKIP_BODY;
	}
}

