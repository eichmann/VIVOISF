package edu.uiowa.slis.VIVOISF.LegalDecision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDecisionProducer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDecisionProducer currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDecisionProducer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegalDecisionProducerIterator theLegalDecisionProducerIterator = (LegalDecisionProducerIterator)findAncestorWithClass(this, LegalDecisionProducerIterator.class);
			pageContext.getOut().print(theLegalDecisionProducerIterator.getProducer());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDecision for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDecision for producer tag ");
		}
		return SKIP_BODY;
	}
}

