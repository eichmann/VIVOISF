package edu.uiowa.slis.VIVOISF.LegalDecision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDecisionOwnerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDecisionOwnerType currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDecisionOwnerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegalDecisionOwnerIterator theLegalDecisionOwnerIterator = (LegalDecisionOwnerIterator)findAncestorWithClass(this, LegalDecisionOwnerIterator.class);
			pageContext.getOut().print(theLegalDecisionOwnerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDecision for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDecision for owner tag ");
		}
		return SKIP_BODY;
	}
}

