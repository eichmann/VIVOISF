package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherNameShortES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherNameShortES currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherNameShortES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PublisherNameShortESIterator thePublisher = (PublisherNameShortESIterator)findAncestorWithClass(this, PublisherNameShortESIterator.class);
			pageContext.getOut().print(thePublisher.getNameShortES());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for nameShortES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for nameShortES tag ");
		}
		return SKIP_BODY;
	}
}

