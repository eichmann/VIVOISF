package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherHasTitle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherHasTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherHasTitle.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PublisherHasTitleIterator thePublisherHasTitleIterator = (PublisherHasTitleIterator)findAncestorWithClass(this, PublisherHasTitleIterator.class);
			pageContext.getOut().print(thePublisherHasTitleIterator.getHasTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for hasTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for hasTitle tag ");
		}
		return SKIP_BODY;
	}
}

