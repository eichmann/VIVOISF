package edu.uiowa.slis.VIVOISF.LegalDecision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDecisionIsbn10 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDecisionIsbn10 currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDecisionIsbn10.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LegalDecisionIsbn10Iterator theLegalDecision = (LegalDecisionIsbn10Iterator)findAncestorWithClass(this, LegalDecisionIsbn10Iterator.class);
			pageContext.getOut().print(theLegalDecision.getIsbn10());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDecision for isbn10 tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDecision for isbn10 tag ");
		}
		return SKIP_BODY;
	}
}

