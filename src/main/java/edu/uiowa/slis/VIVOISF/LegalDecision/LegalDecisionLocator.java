package edu.uiowa.slis.VIVOISF.LegalDecision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDecisionLocator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDecisionLocator currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDecisionLocator.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LegalDecisionLocatorIterator theLegalDecision = (LegalDecisionLocatorIterator)findAncestorWithClass(this, LegalDecisionLocatorIterator.class);
			pageContext.getOut().print(theLegalDecision.getLocator());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDecision for locator tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDecision for locator tag ");
		}
		return SKIP_BODY;
	}
}

