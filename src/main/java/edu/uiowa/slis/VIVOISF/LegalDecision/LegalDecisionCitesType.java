package edu.uiowa.slis.VIVOISF.LegalDecision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDecisionCitesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDecisionCitesType currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDecisionCitesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegalDecisionCitesIterator theLegalDecisionCitesIterator = (LegalDecisionCitesIterator)findAncestorWithClass(this, LegalDecisionCitesIterator.class);
			pageContext.getOut().print(theLegalDecisionCitesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDecision for cites tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDecision for cites tag ");
		}
		return SKIP_BODY;
	}
}

