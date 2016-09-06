package edu.uiowa.slis.VIVOISF.LegalDecision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDecisionIAO_0000136 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDecisionIAO_0000136 currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDecisionIAO_0000136.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegalDecisionIAO_0000136Iterator theLegalDecisionIAO_0000136Iterator = (LegalDecisionIAO_0000136Iterator)findAncestorWithClass(this, LegalDecisionIAO_0000136Iterator.class);
			pageContext.getOut().print(theLegalDecisionIAO_0000136Iterator.getIAO_0000136());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDecision for IAO_0000136 tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDecision for IAO_0000136 tag ");
		}
		return SKIP_BODY;
	}
}

