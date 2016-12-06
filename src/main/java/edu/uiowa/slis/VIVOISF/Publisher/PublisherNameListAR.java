package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherNameListAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherNameListAR currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherNameListAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PublisherNameListARIterator thePublisher = (PublisherNameListARIterator)findAncestorWithClass(this, PublisherNameListARIterator.class);
			pageContext.getOut().print(thePublisher.getNameListAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for nameListAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for nameListAR tag ");
		}
		return SKIP_BODY;
	}
}

