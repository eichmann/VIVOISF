package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherNameOfficialRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherNameOfficialRU currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherNameOfficialRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PublisherNameOfficialRUIterator thePublisher = (PublisherNameOfficialRUIterator)findAncestorWithClass(this, PublisherNameOfficialRUIterator.class);
			pageContext.getOut().print(thePublisher.getNameOfficialRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for nameOfficialRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for nameOfficialRU tag ");
		}
		return SKIP_BODY;
	}
}

