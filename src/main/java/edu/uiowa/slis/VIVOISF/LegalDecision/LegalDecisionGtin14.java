package edu.uiowa.slis.VIVOISF.LegalDecision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDecisionGtin14 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDecisionGtin14 currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDecisionGtin14.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LegalDecisionGtin14Iterator theLegalDecision = (LegalDecisionGtin14Iterator)findAncestorWithClass(this, LegalDecisionGtin14Iterator.class);
			pageContext.getOut().print(theLegalDecision.getGtin14());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDecision for gtin14 tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDecision for gtin14 tag ");
		}
		return SKIP_BODY;
	}
}

