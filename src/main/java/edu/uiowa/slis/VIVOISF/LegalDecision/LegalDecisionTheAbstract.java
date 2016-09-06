package edu.uiowa.slis.VIVOISF.LegalDecision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDecisionTheAbstract extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDecisionTheAbstract currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDecisionTheAbstract.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LegalDecisionTheAbstractIterator theLegalDecision = (LegalDecisionTheAbstractIterator)findAncestorWithClass(this, LegalDecisionTheAbstractIterator.class);
			pageContext.getOut().print(theLegalDecision.getTheAbstract());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDecision for theAbstract tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDecision for theAbstract tag ");
		}
		return SKIP_BODY;
	}
}

