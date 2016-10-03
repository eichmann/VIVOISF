package edu.uiowa.slis.VIVOISF.LegalDecision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDecisionIssuerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDecisionIssuerType currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDecisionIssuerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegalDecisionIssuerIterator theLegalDecisionIssuerIterator = (LegalDecisionIssuerIterator)findAncestorWithClass(this, LegalDecisionIssuerIterator.class);
			pageContext.getOut().print(theLegalDecisionIssuerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDecision for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDecision for issuer tag ");
		}
		return SKIP_BODY;
	}
}

