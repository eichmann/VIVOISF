package edu.uiowa.slis.VIVOISF.LegalDecision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDecisionReproducedIn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDecisionReproducedIn currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDecisionReproducedIn.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegalDecisionReproducedInIterator theLegalDecisionReproducedInIterator = (LegalDecisionReproducedInIterator)findAncestorWithClass(this, LegalDecisionReproducedInIterator.class);
			pageContext.getOut().print(theLegalDecisionReproducedInIterator.getReproducedIn());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDecision for reproducedIn tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDecision for reproducedIn tag ");
		}
		return SKIP_BODY;
	}
}

