package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherNameShortRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherNameShortRU currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherNameShortRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PublisherNameShortRUIterator thePublisher = (PublisherNameShortRUIterator)findAncestorWithClass(this, PublisherNameShortRUIterator.class);
			pageContext.getOut().print(thePublisher.getNameShortRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for nameShortRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for nameShortRU tag ");
		}
		return SKIP_BODY;
	}
}

