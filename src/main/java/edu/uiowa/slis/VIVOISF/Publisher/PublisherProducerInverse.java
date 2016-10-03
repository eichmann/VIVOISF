package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherProducerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherProducerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherProducerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PublisherProducerInverseIterator thePublisherProducerInverseIterator = (PublisherProducerInverseIterator)findAncestorWithClass(this, PublisherProducerInverseIterator.class);
			pageContext.getOut().print(thePublisherProducerInverseIterator.getProducerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for producer tag ");
		}
		return SKIP_BODY;
	}
}

