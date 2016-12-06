package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherNameListIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherNameListIT currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherNameListIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PublisherNameListITIterator thePublisher = (PublisherNameListITIterator)findAncestorWithClass(this, PublisherNameListITIterator.class);
			pageContext.getOut().print(thePublisher.getNameListIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for nameListIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for nameListIT tag ");
		}
		return SKIP_BODY;
	}
}

