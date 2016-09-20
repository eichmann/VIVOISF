package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherOBI_0000304Inverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherOBI_0000304Inverse currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherOBI_0000304Inverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PublisherOBI_0000304InverseIterator thePublisherOBI_0000304InverseIterator = (PublisherOBI_0000304InverseIterator)findAncestorWithClass(this, PublisherOBI_0000304InverseIterator.class);
			pageContext.getOut().print(thePublisherOBI_0000304InverseIterator.getOBI_0000304Inverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for OBI_0000304 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for OBI_0000304 tag ");
		}
		return SKIP_BODY;
	}
}

