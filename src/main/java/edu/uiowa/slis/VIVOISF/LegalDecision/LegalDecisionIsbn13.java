package edu.uiowa.slis.VIVOISF.LegalDecision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDecisionIsbn13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDecisionIsbn13 currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDecisionIsbn13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LegalDecisionIsbn13Iterator theLegalDecision = (LegalDecisionIsbn13Iterator)findAncestorWithClass(this, LegalDecisionIsbn13Iterator.class);
			pageContext.getOut().print(theLegalDecision.getIsbn13());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDecision for isbn13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDecision for isbn13 tag ");
		}
		return SKIP_BODY;
	}
}

