package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherCodeUN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherCodeUN currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherCodeUN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PublisherCodeUNIterator thePublisher = (PublisherCodeUNIterator)findAncestorWithClass(this, PublisherCodeUNIterator.class);
			pageContext.getOut().print(thePublisher.getCodeUN());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for codeUN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for codeUN tag ");
		}
		return SKIP_BODY;
	}
}

