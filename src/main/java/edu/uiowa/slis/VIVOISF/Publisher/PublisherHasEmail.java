package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherHasEmail extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherHasEmail currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherHasEmail.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PublisherHasEmailIterator thePublisherHasEmailIterator = (PublisherHasEmailIterator)findAncestorWithClass(this, PublisherHasEmailIterator.class);
			pageContext.getOut().print(thePublisherHasEmailIterator.getHasEmail());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for hasEmail tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for hasEmail tag ");
		}
		return SKIP_BODY;
	}
}

