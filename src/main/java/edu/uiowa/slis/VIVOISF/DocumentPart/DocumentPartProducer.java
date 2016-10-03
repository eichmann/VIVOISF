package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartProducer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartProducer currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartProducer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentPartProducerIterator theDocumentPartProducerIterator = (DocumentPartProducerIterator)findAncestorWithClass(this, DocumentPartProducerIterator.class);
			pageContext.getOut().print(theDocumentPartProducerIterator.getProducer());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for producer tag ");
		}
		return SKIP_BODY;
	}
}

