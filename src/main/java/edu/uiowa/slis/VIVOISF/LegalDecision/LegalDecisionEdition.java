package edu.uiowa.slis.VIVOISF.LegalDecision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDecisionEdition extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDecisionEdition currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDecisionEdition.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LegalDecisionEditionIterator theLegalDecision = (LegalDecisionEditionIterator)findAncestorWithClass(this, LegalDecisionEditionIterator.class);
			pageContext.getOut().print(theLegalDecision.getEdition());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDecision for edition tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDecision for edition tag ");
		}
		return SKIP_BODY;
	}
}

