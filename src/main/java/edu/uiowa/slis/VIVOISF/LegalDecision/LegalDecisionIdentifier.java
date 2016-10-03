package edu.uiowa.slis.VIVOISF.LegalDecision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDecisionIdentifier extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDecisionIdentifier currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDecisionIdentifier.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LegalDecisionIdentifierIterator theLegalDecision = (LegalDecisionIdentifierIterator)findAncestorWithClass(this, LegalDecisionIdentifierIterator.class);
			pageContext.getOut().print(theLegalDecision.getIdentifier());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDecision for identifier tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDecision for identifier tag ");
		}
		return SKIP_BODY;
	}
}

