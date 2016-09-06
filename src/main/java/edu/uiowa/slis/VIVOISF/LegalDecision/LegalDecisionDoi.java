package edu.uiowa.slis.VIVOISF.LegalDecision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDecisionDoi extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDecisionDoi currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDecisionDoi.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LegalDecisionDoiIterator theLegalDecision = (LegalDecisionDoiIterator)findAncestorWithClass(this, LegalDecisionDoiIterator.class);
			pageContext.getOut().print(theLegalDecision.getDoi());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDecision for doi tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDecision for doi tag ");
		}
		return SKIP_BODY;
	}
}

