package edu.uiowa.slis.VIVOISF.LegalDecision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDecisionCourt extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDecisionCourt currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDecisionCourt.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegalDecisionCourtIterator theLegalDecisionCourtIterator = (LegalDecisionCourtIterator)findAncestorWithClass(this, LegalDecisionCourtIterator.class);
			pageContext.getOut().print(theLegalDecisionCourtIterator.getCourt());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDecision for court tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDecision for court tag ");
		}
		return SKIP_BODY;
	}
}

