package edu.uiowa.slis.VIVOISF.LegalDecision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDecisionRO_0000056 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDecisionRO_0000056 currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDecisionRO_0000056.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegalDecisionRO_0000056Iterator theLegalDecisionRO_0000056Iterator = (LegalDecisionRO_0000056Iterator)findAncestorWithClass(this, LegalDecisionRO_0000056Iterator.class);
			pageContext.getOut().print(theLegalDecisionRO_0000056Iterator.getRO_0000056());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDecision for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDecision for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

