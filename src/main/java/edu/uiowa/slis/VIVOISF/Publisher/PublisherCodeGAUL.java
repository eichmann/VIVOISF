package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherCodeGAUL extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherCodeGAUL currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherCodeGAUL.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PublisherCodeGAULIterator thePublisher = (PublisherCodeGAULIterator)findAncestorWithClass(this, PublisherCodeGAULIterator.class);
			pageContext.getOut().print(thePublisher.getCodeGAUL());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for codeGAUL tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for codeGAUL tag ");
		}
		return SKIP_BODY;
	}
}

