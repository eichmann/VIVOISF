package edu.uiowa.slis.VIVOISF.LegalDecision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDecisionHasTranslationType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDecisionHasTranslationType currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDecisionHasTranslationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegalDecisionHasTranslationIterator theLegalDecisionHasTranslationIterator = (LegalDecisionHasTranslationIterator)findAncestorWithClass(this, LegalDecisionHasTranslationIterator.class);
			pageContext.getOut().print(theLegalDecisionHasTranslationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDecision for hasTranslation tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDecision for hasTranslation tag ");
		}
		return SKIP_BODY;
	}
}

