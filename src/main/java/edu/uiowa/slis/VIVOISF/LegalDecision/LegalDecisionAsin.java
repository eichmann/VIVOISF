package edu.uiowa.slis.VIVOISF.LegalDecision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDecisionAsin extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDecisionAsin currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDecisionAsin.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LegalDecisionAsinIterator theLegalDecision = (LegalDecisionAsinIterator)findAncestorWithClass(this, LegalDecisionAsinIterator.class);
			pageContext.getOut().print(theLegalDecision.getAsin());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDecision for asin tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDecision for asin tag ");
		}
		return SKIP_BODY;
	}
}

