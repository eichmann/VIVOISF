package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherHDINotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherHDINotes currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherHDINotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PublisherHDINotesIterator thePublisher = (PublisherHDINotesIterator)findAncestorWithClass(this, PublisherHDINotesIterator.class);
			pageContext.getOut().print(thePublisher.getHDINotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for HDINotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for HDINotes tag ");
		}
		return SKIP_BODY;
	}
}

