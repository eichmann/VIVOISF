package edu.uiowa.slis.VIVOISF.LegalDecision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDecisionCoden extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDecisionCoden currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDecisionCoden.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LegalDecisionCodenIterator theLegalDecision = (LegalDecisionCodenIterator)findAncestorWithClass(this, LegalDecisionCodenIterator.class);
			pageContext.getOut().print(theLegalDecision.getCoden());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDecision for coden tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDecision for coden tag ");
		}
		return SKIP_BODY;
	}
}

