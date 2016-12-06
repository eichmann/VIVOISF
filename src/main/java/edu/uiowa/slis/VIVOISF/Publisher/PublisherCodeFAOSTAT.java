package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherCodeFAOSTAT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherCodeFAOSTAT currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherCodeFAOSTAT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PublisherCodeFAOSTATIterator thePublisher = (PublisherCodeFAOSTATIterator)findAncestorWithClass(this, PublisherCodeFAOSTATIterator.class);
			pageContext.getOut().print(thePublisher.getCodeFAOSTAT());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for codeFAOSTAT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for codeFAOSTAT tag ");
		}
		return SKIP_BODY;
	}
}

