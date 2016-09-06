package edu.uiowa.slis.VIVOISF.LegalDecision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDecisionFeaturesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDecisionFeaturesType currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDecisionFeaturesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegalDecisionFeaturesIterator theLegalDecisionFeaturesIterator = (LegalDecisionFeaturesIterator)findAncestorWithClass(this, LegalDecisionFeaturesIterator.class);
			pageContext.getOut().print(theLegalDecisionFeaturesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDecision for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDecision for features tag ");
		}
		return SKIP_BODY;
	}
}

