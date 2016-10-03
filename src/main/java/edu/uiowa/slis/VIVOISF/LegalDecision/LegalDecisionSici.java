package edu.uiowa.slis.VIVOISF.LegalDecision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDecisionSici extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDecisionSici currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDecisionSici.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LegalDecisionSiciIterator theLegalDecision = (LegalDecisionSiciIterator)findAncestorWithClass(this, LegalDecisionSiciIterator.class);
			pageContext.getOut().print(theLegalDecision.getSici());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDecision for sici tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDecision for sici tag ");
		}
		return SKIP_BODY;
	}
}

