package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherNameShortZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherNameShortZH currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherNameShortZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PublisherNameShortZHIterator thePublisher = (PublisherNameShortZHIterator)findAncestorWithClass(this, PublisherNameShortZHIterator.class);
			pageContext.getOut().print(thePublisher.getNameShortZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for nameShortZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for nameShortZH tag ");
		}
		return SKIP_BODY;
	}
}

