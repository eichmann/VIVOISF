package edu.uiowa.slis.VIVOISF.LegalDecision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDecisionAuthorList extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDecisionAuthorList currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDecisionAuthorList.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegalDecisionAuthorListIterator theLegalDecisionAuthorListIterator = (LegalDecisionAuthorListIterator)findAncestorWithClass(this, LegalDecisionAuthorListIterator.class);
			pageContext.getOut().print(theLegalDecisionAuthorListIterator.getAuthorList());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDecision for authorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDecision for authorList tag ");
		}
		return SKIP_BODY;
	}
}

