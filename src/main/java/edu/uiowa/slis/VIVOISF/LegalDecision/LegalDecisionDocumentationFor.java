package edu.uiowa.slis.VIVOISF.LegalDecision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDecisionDocumentationFor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDecisionDocumentationFor currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDecisionDocumentationFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegalDecisionDocumentationForIterator theLegalDecisionDocumentationForIterator = (LegalDecisionDocumentationForIterator)findAncestorWithClass(this, LegalDecisionDocumentationForIterator.class);
			pageContext.getOut().print(theLegalDecisionDocumentationForIterator.getDocumentationFor());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDecision for documentationFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDecision for documentationFor tag ");
		}
		return SKIP_BODY;
	}
}

