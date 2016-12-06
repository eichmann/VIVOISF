package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherCodeAGROVOC extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherCodeAGROVOC currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherCodeAGROVOC.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PublisherCodeAGROVOCIterator thePublisher = (PublisherCodeAGROVOCIterator)findAncestorWithClass(this, PublisherCodeAGROVOCIterator.class);
			pageContext.getOut().print(thePublisher.getCodeAGROVOC());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for codeAGROVOC tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for codeAGROVOC tag ");
		}
		return SKIP_BODY;
	}
}

