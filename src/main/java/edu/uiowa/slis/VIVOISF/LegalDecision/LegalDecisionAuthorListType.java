package edu.uiowa.slis.VIVOISF.LegalDecision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDecisionAuthorListType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDecisionAuthorListType currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDecisionAuthorListType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegalDecisionAuthorListIterator theLegalDecisionAuthorListIterator = (LegalDecisionAuthorListIterator)findAncestorWithClass(this, LegalDecisionAuthorListIterator.class);
			pageContext.getOut().print(theLegalDecisionAuthorListIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDecision for authorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDecision for authorList tag ");
		}
		return SKIP_BODY;
	}
}
