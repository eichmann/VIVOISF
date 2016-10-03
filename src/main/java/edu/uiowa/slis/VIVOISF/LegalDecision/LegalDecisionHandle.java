package edu.uiowa.slis.VIVOISF.LegalDecision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDecisionHandle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDecisionHandle currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDecisionHandle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LegalDecisionHandleIterator theLegalDecision = (LegalDecisionHandleIterator)findAncestorWithClass(this, LegalDecisionHandleIterator.class);
			pageContext.getOut().print(theLegalDecision.getHandle());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDecision for handle tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDecision for handle tag ");
		}
		return SKIP_BODY;
	}
}

