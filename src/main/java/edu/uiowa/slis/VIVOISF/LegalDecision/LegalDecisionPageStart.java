package edu.uiowa.slis.VIVOISF.LegalDecision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDecisionPageStart extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDecisionPageStart currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDecisionPageStart.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LegalDecisionPageStartIterator theLegalDecision = (LegalDecisionPageStartIterator)findAncestorWithClass(this, LegalDecisionPageStartIterator.class);
			pageContext.getOut().print(theLegalDecision.getPageStart());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDecision for pageStart tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDecision for pageStart tag ");
		}
		return SKIP_BODY;
	}
}

