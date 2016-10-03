package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherRecipientInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherRecipientInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherRecipientInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PublisherRecipientInverseIterator thePublisherRecipientInverseIterator = (PublisherRecipientInverseIterator)findAncestorWithClass(this, PublisherRecipientInverseIterator.class);
			pageContext.getOut().print(thePublisherRecipientInverseIterator.getRecipientInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for recipient tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for recipient tag ");
		}
		return SKIP_BODY;
	}
}

