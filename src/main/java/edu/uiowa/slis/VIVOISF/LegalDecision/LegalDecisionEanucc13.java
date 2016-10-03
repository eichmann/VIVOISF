package edu.uiowa.slis.VIVOISF.LegalDecision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDecisionEanucc13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDecisionEanucc13 currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDecisionEanucc13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LegalDecisionEanucc13Iterator theLegalDecision = (LegalDecisionEanucc13Iterator)findAncestorWithClass(this, LegalDecisionEanucc13Iterator.class);
			pageContext.getOut().print(theLegalDecision.getEanucc13());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDecision for eanucc13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDecision for eanucc13 tag ");
		}
		return SKIP_BODY;
	}
}

