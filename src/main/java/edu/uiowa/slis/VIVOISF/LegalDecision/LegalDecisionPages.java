package edu.uiowa.slis.VIVOISF.LegalDecision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDecisionPages extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDecisionPages currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDecisionPages.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LegalDecisionPagesIterator theLegalDecision = (LegalDecisionPagesIterator)findAncestorWithClass(this, LegalDecisionPagesIterator.class);
			pageContext.getOut().print(theLegalDecision.getPages());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDecision for pages tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDecision for pages tag ");
		}
		return SKIP_BODY;
	}
}

