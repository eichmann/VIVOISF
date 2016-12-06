package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherNameShortFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherNameShortFR currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherNameShortFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PublisherNameShortFRIterator thePublisher = (PublisherNameShortFRIterator)findAncestorWithClass(this, PublisherNameShortFRIterator.class);
			pageContext.getOut().print(thePublisher.getNameShortFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for nameShortFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for nameShortFR tag ");
		}
		return SKIP_BODY;
	}
}

