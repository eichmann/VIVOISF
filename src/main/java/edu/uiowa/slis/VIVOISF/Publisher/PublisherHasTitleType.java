package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherHasTitleType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherHasTitleType currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherHasTitleType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PublisherHasTitleIterator thePublisherHasTitleIterator = (PublisherHasTitleIterator)findAncestorWithClass(this, PublisherHasTitleIterator.class);
			pageContext.getOut().print(thePublisherHasTitleIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for hasTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for hasTitle tag ");
		}
		return SKIP_BODY;
	}
}

