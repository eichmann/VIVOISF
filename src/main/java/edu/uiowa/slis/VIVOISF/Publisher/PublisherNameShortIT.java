package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherNameShortIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherNameShortIT currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherNameShortIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PublisherNameShortITIterator thePublisher = (PublisherNameShortITIterator)findAncestorWithClass(this, PublisherNameShortITIterator.class);
			pageContext.getOut().print(thePublisher.getNameShortIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for nameShortIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for nameShortIT tag ");
		}
		return SKIP_BODY;
	}
}

