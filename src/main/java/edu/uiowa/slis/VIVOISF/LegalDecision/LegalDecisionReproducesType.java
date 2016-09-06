package edu.uiowa.slis.VIVOISF.LegalDecision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDecisionReproducesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDecisionReproducesType currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDecisionReproducesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegalDecisionReproducesIterator theLegalDecisionReproducesIterator = (LegalDecisionReproducesIterator)findAncestorWithClass(this, LegalDecisionReproducesIterator.class);
			pageContext.getOut().print(theLegalDecisionReproducesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDecision for reproduces tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDecision for reproduces tag ");
		}
		return SKIP_BODY;
	}
}

