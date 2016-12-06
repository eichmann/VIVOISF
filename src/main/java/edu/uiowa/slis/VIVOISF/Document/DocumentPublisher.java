package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPublisher extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPublisher currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPublisher.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentPublisherIterator theDocumentPublisherIterator = (DocumentPublisherIterator)findAncestorWithClass(this, DocumentPublisherIterator.class);
			pageContext.getOut().print(theDocumentPublisherIterator.getPublisher());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for publisher tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for publisher tag ");
		}
		return SKIP_BODY;
	}
}

