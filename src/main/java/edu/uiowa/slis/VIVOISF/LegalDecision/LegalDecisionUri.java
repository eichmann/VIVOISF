package edu.uiowa.slis.VIVOISF.LegalDecision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDecisionUri extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDecisionUri currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDecisionUri.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LegalDecisionUriIterator theLegalDecision = (LegalDecisionUriIterator)findAncestorWithClass(this, LegalDecisionUriIterator.class);
			pageContext.getOut().print(theLegalDecision.getUri());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDecision for uri tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDecision for uri tag ");
		}
		return SKIP_BODY;
	}
}

