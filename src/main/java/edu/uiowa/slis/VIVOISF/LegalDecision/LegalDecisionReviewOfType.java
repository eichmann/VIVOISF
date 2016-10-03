package edu.uiowa.slis.VIVOISF.LegalDecision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDecisionReviewOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDecisionReviewOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDecisionReviewOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegalDecisionReviewOfIterator theLegalDecisionReviewOfIterator = (LegalDecisionReviewOfIterator)findAncestorWithClass(this, LegalDecisionReviewOfIterator.class);
			pageContext.getOut().print(theLegalDecisionReviewOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDecision for reviewOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDecision for reviewOf tag ");
		}
		return SKIP_BODY;
	}
}

