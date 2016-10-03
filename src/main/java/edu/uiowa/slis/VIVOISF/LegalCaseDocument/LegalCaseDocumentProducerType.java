package edu.uiowa.slis.VIVOISF.LegalCaseDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalCaseDocumentProducerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalCaseDocumentProducerType currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalCaseDocumentProducerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegalCaseDocumentProducerIterator theLegalCaseDocumentProducerIterator = (LegalCaseDocumentProducerIterator)findAncestorWithClass(this, LegalCaseDocumentProducerIterator.class);
			pageContext.getOut().print(theLegalCaseDocumentProducerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalCaseDocument for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalCaseDocument for producer tag ");
		}
		return SKIP_BODY;
	}
}

