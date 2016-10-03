package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherCourtInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherCourtInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherCourtInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PublisherCourtInverseIterator thePublisherCourtInverseIterator = (PublisherCourtInverseIterator)findAncestorWithClass(this, PublisherCourtInverseIterator.class);
			pageContext.getOut().print(thePublisherCourtInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for court tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for court tag ");
		}
		return SKIP_BODY;
	}
}

