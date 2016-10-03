package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherPerformerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherPerformerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherPerformerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PublisherPerformerInverseIterator thePublisherPerformerInverseIterator = (PublisherPerformerInverseIterator)findAncestorWithClass(this, PublisherPerformerInverseIterator.class);
			pageContext.getOut().print(thePublisherPerformerInverseIterator.getPerformerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for performer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for performer tag ");
		}
		return SKIP_BODY;
	}
}

