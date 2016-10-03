package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentProducer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentProducer currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentProducer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentProducerIterator theDocumentProducerIterator = (DocumentProducerIterator)findAncestorWithClass(this, DocumentProducerIterator.class);
			pageContext.getOut().print(theDocumentProducerIterator.getProducer());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for producer tag ");
		}
		return SKIP_BODY;
	}
}

