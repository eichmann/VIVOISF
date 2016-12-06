package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherNameShortAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherNameShortAR currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherNameShortAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PublisherNameShortARIterator thePublisher = (PublisherNameShortARIterator)findAncestorWithClass(this, PublisherNameShortARIterator.class);
			pageContext.getOut().print(thePublisher.getNameShortAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for nameShortAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for nameShortAR tag ");
		}
		return SKIP_BODY;
	}
}

