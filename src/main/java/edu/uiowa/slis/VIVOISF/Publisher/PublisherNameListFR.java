package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherNameListFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherNameListFR currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherNameListFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PublisherNameListFRIterator thePublisher = (PublisherNameListFRIterator)findAncestorWithClass(this, PublisherNameListFRIterator.class);
			pageContext.getOut().print(thePublisher.getNameListFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for nameListFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for nameListFR tag ");
		}
		return SKIP_BODY;
	}
}

