package edu.uiowa.slis.VIVOISF.CollectedDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectedDocumentProducer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectedDocumentProducer currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectedDocumentProducer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectedDocumentProducerIterator theCollectedDocumentProducerIterator = (CollectedDocumentProducerIterator)findAncestorWithClass(this, CollectedDocumentProducerIterator.class);
			pageContext.getOut().print(theCollectedDocumentProducerIterator.getProducer());
		} catch (Exception e) {
			log.error("Can't find enclosing CollectedDocument for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing CollectedDocument for producer tag ");
		}
		return SKIP_BODY;
	}
}

