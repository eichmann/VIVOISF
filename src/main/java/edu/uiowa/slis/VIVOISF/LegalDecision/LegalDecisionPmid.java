package edu.uiowa.slis.VIVOISF.LegalDecision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDecisionPmid extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDecisionPmid currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDecisionPmid.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LegalDecisionPmidIterator theLegalDecision = (LegalDecisionPmidIterator)findAncestorWithClass(this, LegalDecisionPmidIterator.class);
			pageContext.getOut().print(theLegalDecision.getPmid());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDecision for pmid tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDecision for pmid tag ");
		}
		return SKIP_BODY;
	}
}

