package edu.uiowa.slis.VIVOISF.LegalDecision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDecisionCitedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDecisionCitedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDecisionCitedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegalDecisionCitedByIterator theLegalDecisionCitedByIterator = (LegalDecisionCitedByIterator)findAncestorWithClass(this, LegalDecisionCitedByIterator.class);
			pageContext.getOut().print(theLegalDecisionCitedByIterator.getCitedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDecision for citedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDecision for citedBy tag ");
		}
		return SKIP_BODY;
	}
}

