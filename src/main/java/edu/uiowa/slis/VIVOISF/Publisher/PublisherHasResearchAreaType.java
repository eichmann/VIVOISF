package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherHasResearchAreaType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherHasResearchAreaType currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherHasResearchAreaType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PublisherHasResearchAreaIterator thePublisherHasResearchAreaIterator = (PublisherHasResearchAreaIterator)findAncestorWithClass(this, PublisherHasResearchAreaIterator.class);
			pageContext.getOut().print(thePublisherHasResearchAreaIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for hasResearchArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for hasResearchArea tag ");
		}
		return SKIP_BODY;
	}
}
