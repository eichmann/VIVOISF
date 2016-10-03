package edu.uiowa.slis.VIVOISF.LegalDecision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDecisionNumPages extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDecisionNumPages currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDecisionNumPages.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LegalDecisionNumPagesIterator theLegalDecision = (LegalDecisionNumPagesIterator)findAncestorWithClass(this, LegalDecisionNumPagesIterator.class);
			pageContext.getOut().print(theLegalDecision.getNumPages());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDecision for numPages tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDecision for numPages tag ");
		}
		return SKIP_BODY;
	}
}

