package edu.uiowa.slis.VIVOISF.LegalDecision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDecisionSection extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDecisionSection currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDecisionSection.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LegalDecisionSectionIterator theLegalDecision = (LegalDecisionSectionIterator)findAncestorWithClass(this, LegalDecisionSectionIterator.class);
			pageContext.getOut().print(theLegalDecision.getSection());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDecision for section tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDecision for section tag ");
		}
		return SKIP_BODY;
	}
}

