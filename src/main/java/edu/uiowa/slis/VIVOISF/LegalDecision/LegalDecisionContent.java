package edu.uiowa.slis.VIVOISF.LegalDecision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDecisionContent extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDecisionContent currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDecisionContent.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LegalDecisionContentIterator theLegalDecision = (LegalDecisionContentIterator)findAncestorWithClass(this, LegalDecisionContentIterator.class);
			pageContext.getOut().print(theLegalDecision.getContent());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDecision for content tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDecision for content tag ");
		}
		return SKIP_BODY;
	}
}

