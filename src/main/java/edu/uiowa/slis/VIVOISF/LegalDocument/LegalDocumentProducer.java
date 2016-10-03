package edu.uiowa.slis.VIVOISF.LegalDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDocumentProducer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDocumentProducer currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDocumentProducer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegalDocumentProducerIterator theLegalDocumentProducerIterator = (LegalDocumentProducerIterator)findAncestorWithClass(this, LegalDocumentProducerIterator.class);
			pageContext.getOut().print(theLegalDocumentProducerIterator.getProducer());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDocument for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDocument for producer tag ");
		}
		return SKIP_BODY;
	}
}

