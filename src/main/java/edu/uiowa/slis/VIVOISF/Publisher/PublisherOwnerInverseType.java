package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherOwnerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherOwnerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherOwnerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PublisherOwnerInverseIterator thePublisherOwnerInverseIterator = (PublisherOwnerInverseIterator)findAncestorWithClass(this, PublisherOwnerInverseIterator.class);
			pageContext.getOut().print(thePublisherOwnerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for owner tag ");
		}
		return SKIP_BODY;
	}
}

