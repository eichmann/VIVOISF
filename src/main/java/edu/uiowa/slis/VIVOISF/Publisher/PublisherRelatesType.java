package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherRelatesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherRelatesType currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherRelatesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PublisherRelatesIterator thePublisherRelatesIterator = (PublisherRelatesIterator)findAncestorWithClass(this, PublisherRelatesIterator.class);
			pageContext.getOut().print(thePublisherRelatesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for relates tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for relates tag ");
		}
		return SKIP_BODY;
	}
}

