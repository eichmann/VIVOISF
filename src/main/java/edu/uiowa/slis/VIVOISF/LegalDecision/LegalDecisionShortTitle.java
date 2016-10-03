package edu.uiowa.slis.VIVOISF.LegalDecision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDecisionShortTitle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDecisionShortTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDecisionShortTitle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LegalDecisionShortTitleIterator theLegalDecision = (LegalDecisionShortTitleIterator)findAncestorWithClass(this, LegalDecisionShortTitleIterator.class);
			pageContext.getOut().print(theLegalDecision.getShortTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDecision for shortTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDecision for shortTitle tag ");
		}
		return SKIP_BODY;
	}
}

