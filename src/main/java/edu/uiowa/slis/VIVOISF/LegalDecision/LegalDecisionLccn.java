package edu.uiowa.slis.VIVOISF.LegalDecision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDecisionLccn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDecisionLccn currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDecisionLccn.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LegalDecisionLccnIterator theLegalDecision = (LegalDecisionLccnIterator)findAncestorWithClass(this, LegalDecisionLccnIterator.class);
			pageContext.getOut().print(theLegalDecision.getLccn());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDecision for lccn tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDecision for lccn tag ");
		}
		return SKIP_BODY;
	}
}

