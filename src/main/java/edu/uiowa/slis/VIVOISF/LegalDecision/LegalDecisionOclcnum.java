package edu.uiowa.slis.VIVOISF.LegalDecision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDecisionOclcnum extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDecisionOclcnum currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDecisionOclcnum.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LegalDecisionOclcnumIterator theLegalDecision = (LegalDecisionOclcnumIterator)findAncestorWithClass(this, LegalDecisionOclcnumIterator.class);
			pageContext.getOut().print(theLegalDecision.getOclcnum());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDecision for oclcnum tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDecision for oclcnum tag ");
		}
		return SKIP_BODY;
	}
}

