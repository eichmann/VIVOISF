package edu.uiowa.slis.VIVOISF.LegalDecision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDecisionNumber extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDecisionNumber currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDecisionNumber.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LegalDecisionNumberIterator theLegalDecision = (LegalDecisionNumberIterator)findAncestorWithClass(this, LegalDecisionNumberIterator.class);
			pageContext.getOut().print(theLegalDecision.getNumber());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDecision for number tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDecision for number tag ");
		}
		return SKIP_BODY;
	}
}

