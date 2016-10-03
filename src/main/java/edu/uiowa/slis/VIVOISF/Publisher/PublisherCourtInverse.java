package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherCourtInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherCourtInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherCourtInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PublisherCourtInverseIterator thePublisherCourtInverseIterator = (PublisherCourtInverseIterator)findAncestorWithClass(this, PublisherCourtInverseIterator.class);
			pageContext.getOut().print(thePublisherCourtInverseIterator.getCourtInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for court tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for court tag ");
		}
		return SKIP_BODY;
	}
}

