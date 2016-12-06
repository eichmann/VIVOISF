package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherNameShortEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherNameShortEN currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherNameShortEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PublisherNameShortENIterator thePublisher = (PublisherNameShortENIterator)findAncestorWithClass(this, PublisherNameShortENIterator.class);
			pageContext.getOut().print(thePublisher.getNameShortEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for nameShortEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for nameShortEN tag ");
		}
		return SKIP_BODY;
	}
}

