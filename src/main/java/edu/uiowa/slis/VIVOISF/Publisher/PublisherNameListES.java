package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherNameListES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherNameListES currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherNameListES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PublisherNameListESIterator thePublisher = (PublisherNameListESIterator)findAncestorWithClass(this, PublisherNameListESIterator.class);
			pageContext.getOut().print(thePublisher.getNameListES());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for nameListES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for nameListES tag ");
		}
		return SKIP_BODY;
	}
}

