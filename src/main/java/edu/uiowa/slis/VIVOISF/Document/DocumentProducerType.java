package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentProducerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentProducerType currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentProducerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentProducerIterator theDocumentProducerIterator = (DocumentProducerIterator)findAncestorWithClass(this, DocumentProducerIterator.class);
			pageContext.getOut().print(theDocumentProducerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for producer tag ");
		}
		return SKIP_BODY;
	}
}

