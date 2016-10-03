package edu.uiowa.slis.VIVOISF.LegalDecision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDecisionDistributor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDecisionDistributor currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDecisionDistributor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegalDecisionDistributorIterator theLegalDecisionDistributorIterator = (LegalDecisionDistributorIterator)findAncestorWithClass(this, LegalDecisionDistributorIterator.class);
			pageContext.getOut().print(theLegalDecisionDistributorIterator.getDistributor());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDecision for distributor tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDecision for distributor tag ");
		}
		return SKIP_BODY;
	}
}

