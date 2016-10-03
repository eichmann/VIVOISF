package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherRecipientInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherRecipientInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherRecipientInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PublisherRecipientInverseIterator thePublisherRecipientInverseIterator = (PublisherRecipientInverseIterator)findAncestorWithClass(this, PublisherRecipientInverseIterator.class);
			pageContext.getOut().print(thePublisherRecipientInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for recipient tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for recipient tag ");
		}
		return SKIP_BODY;
	}
}

