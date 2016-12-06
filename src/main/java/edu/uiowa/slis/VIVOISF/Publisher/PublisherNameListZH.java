package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherNameListZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherNameListZH currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherNameListZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PublisherNameListZHIterator thePublisher = (PublisherNameListZHIterator)findAncestorWithClass(this, PublisherNameListZHIterator.class);
			pageContext.getOut().print(thePublisher.getNameListZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for nameListZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for nameListZH tag ");
		}
		return SKIP_BODY;
	}
}

