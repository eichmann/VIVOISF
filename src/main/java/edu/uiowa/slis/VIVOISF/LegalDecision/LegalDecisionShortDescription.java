package edu.uiowa.slis.VIVOISF.LegalDecision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDecisionShortDescription extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDecisionShortDescription currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDecisionShortDescription.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LegalDecisionShortDescriptionIterator theLegalDecision = (LegalDecisionShortDescriptionIterator)findAncestorWithClass(this, LegalDecisionShortDescriptionIterator.class);
			pageContext.getOut().print(theLegalDecision.getShortDescription());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDecision for shortDescription tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDecision for shortDescription tag ");
		}
		return SKIP_BODY;
	}
}

