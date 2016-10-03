package edu.uiowa.slis.VIVOISF.LegalDecision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDecisionPageEnd extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDecisionPageEnd currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDecisionPageEnd.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LegalDecisionPageEndIterator theLegalDecision = (LegalDecisionPageEndIterator)findAncestorWithClass(this, LegalDecisionPageEndIterator.class);
			pageContext.getOut().print(theLegalDecision.getPageEnd());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDecision for pageEnd tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDecision for pageEnd tag ");
		}
		return SKIP_BODY;
	}
}

