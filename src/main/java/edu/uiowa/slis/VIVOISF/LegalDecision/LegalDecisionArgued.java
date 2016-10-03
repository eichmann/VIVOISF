package edu.uiowa.slis.VIVOISF.LegalDecision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDecisionArgued extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDecisionArgued currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDecisionArgued.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LegalDecisionArguedIterator theLegalDecision = (LegalDecisionArguedIterator)findAncestorWithClass(this, LegalDecisionArguedIterator.class);
			pageContext.getOut().print(theLegalDecision.getArgued());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDecision for argued tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDecision for argued tag ");
		}
		return SKIP_BODY;
	}
}

