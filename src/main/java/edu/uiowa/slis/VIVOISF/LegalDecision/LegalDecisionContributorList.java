package edu.uiowa.slis.VIVOISF.LegalDecision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDecisionContributorList extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDecisionContributorList currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDecisionContributorList.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegalDecisionContributorListIterator theLegalDecisionContributorListIterator = (LegalDecisionContributorListIterator)findAncestorWithClass(this, LegalDecisionContributorListIterator.class);
			pageContext.getOut().print(theLegalDecisionContributorListIterator.getContributorList());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDecision for contributorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDecision for contributorList tag ");
		}
		return SKIP_BODY;
	}
}

