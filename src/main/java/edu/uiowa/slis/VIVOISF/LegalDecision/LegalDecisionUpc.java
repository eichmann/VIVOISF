package edu.uiowa.slis.VIVOISF.LegalDecision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDecisionUpc extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDecisionUpc currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDecisionUpc.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LegalDecisionUpcIterator theLegalDecision = (LegalDecisionUpcIterator)findAncestorWithClass(this, LegalDecisionUpcIterator.class);
			pageContext.getOut().print(theLegalDecision.getUpc());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDecision for upc tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDecision for upc tag ");
		}
		return SKIP_BODY;
	}
}

