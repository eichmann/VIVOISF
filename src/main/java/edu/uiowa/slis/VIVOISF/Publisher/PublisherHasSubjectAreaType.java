package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherHasSubjectAreaType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherHasSubjectAreaType currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherHasSubjectAreaType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PublisherHasSubjectAreaIterator thePublisherHasSubjectAreaIterator = (PublisherHasSubjectAreaIterator)findAncestorWithClass(this, PublisherHasSubjectAreaIterator.class);
			pageContext.getOut().print(thePublisherHasSubjectAreaIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for hasSubjectArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for hasSubjectArea tag ");
		}
		return SKIP_BODY;
	}
}

