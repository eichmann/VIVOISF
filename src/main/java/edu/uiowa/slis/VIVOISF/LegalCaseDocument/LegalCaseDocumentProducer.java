package edu.uiowa.slis.VIVOISF.LegalCaseDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalCaseDocumentProducer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalCaseDocumentProducer currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalCaseDocumentProducer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegalCaseDocumentProducerIterator theLegalCaseDocumentProducerIterator = (LegalCaseDocumentProducerIterator)findAncestorWithClass(this, LegalCaseDocumentProducerIterator.class);
			pageContext.getOut().print(theLegalCaseDocumentProducerIterator.getProducer());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalCaseDocument for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalCaseDocument for producer tag ");
		}
		return SKIP_BODY;
	}
}

