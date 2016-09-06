package edu.uiowa.slis.VIVOISF.LegalDecision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDecisionTranslatorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDecisionTranslatorType currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDecisionTranslatorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegalDecisionTranslatorIterator theLegalDecisionTranslatorIterator = (LegalDecisionTranslatorIterator)findAncestorWithClass(this, LegalDecisionTranslatorIterator.class);
			pageContext.getOut().print(theLegalDecisionTranslatorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDecision for translator tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDecision for translator tag ");
		}
		return SKIP_BODY;
	}
}

