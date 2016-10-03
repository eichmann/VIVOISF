package edu.uiowa.slis.VIVOISF.LegalDecision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDecisionIssuer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDecisionIssuer currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDecisionIssuer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegalDecisionIssuerIterator theLegalDecisionIssuerIterator = (LegalDecisionIssuerIterator)findAncestorWithClass(this, LegalDecisionIssuerIterator.class);
			pageContext.getOut().print(theLegalDecisionIssuerIterator.getIssuer());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDecision for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDecision for issuer tag ");
		}
		return SKIP_BODY;
	}
}

