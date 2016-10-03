package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartProducerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartProducerType currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartProducerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentPartProducerIterator theDocumentPartProducerIterator = (DocumentPartProducerIterator)findAncestorWithClass(this, DocumentPartProducerIterator.class);
			pageContext.getOut().print(theDocumentPartProducerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for producer tag ");
		}
		return SKIP_BODY;
	}
}

