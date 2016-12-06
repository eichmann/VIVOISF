package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherNameListRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherNameListRU currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherNameListRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PublisherNameListRUIterator thePublisher = (PublisherNameListRUIterator)findAncestorWithClass(this, PublisherNameListRUIterator.class);
			pageContext.getOut().print(thePublisher.getNameListRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for nameListRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for nameListRU tag ");
		}
		return SKIP_BODY;
	}
}

