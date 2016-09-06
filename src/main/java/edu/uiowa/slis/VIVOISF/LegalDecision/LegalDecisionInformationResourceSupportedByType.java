package edu.uiowa.slis.VIVOISF.LegalDecision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDecisionInformationResourceSupportedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDecisionInformationResourceSupportedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDecisionInformationResourceSupportedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegalDecisionInformationResourceSupportedByIterator theLegalDecisionInformationResourceSupportedByIterator = (LegalDecisionInformationResourceSupportedByIterator)findAncestorWithClass(this, LegalDecisionInformationResourceSupportedByIterator.class);
			pageContext.getOut().print(theLegalDecisionInformationResourceSupportedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDecision for informationResourceSupportedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDecision for informationResourceSupportedBy tag ");
		}
		return SKIP_BODY;
	}
}

