package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherCodeUNDP extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherCodeUNDP currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherCodeUNDP.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PublisherCodeUNDPIterator thePublisher = (PublisherCodeUNDPIterator)findAncestorWithClass(this, PublisherCodeUNDPIterator.class);
			pageContext.getOut().print(thePublisher.getCodeUNDP());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for codeUNDP tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for codeUNDP tag ");
		}
		return SKIP_BODY;
	}
}

