package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherDirectorInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherDirectorInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherDirectorInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PublisherDirectorInverseIterator thePublisherDirectorInverseIterator = (PublisherDirectorInverseIterator)findAncestorWithClass(this, PublisherDirectorInverseIterator.class);
			pageContext.getOut().print(thePublisherDirectorInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for director tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for director tag ");
		}
		return SKIP_BODY;
	}
}

