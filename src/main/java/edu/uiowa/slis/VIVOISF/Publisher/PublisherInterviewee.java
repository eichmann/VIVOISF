package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherInterviewee extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherInterviewee currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherInterviewee.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PublisherIntervieweeIterator thePublisherIntervieweeIterator = (PublisherIntervieweeIterator)findAncestorWithClass(this, PublisherIntervieweeIterator.class);
			pageContext.getOut().print(thePublisherIntervieweeIterator.getInterviewee());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for interviewee tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for interviewee tag ");
		}
		return SKIP_BODY;
	}
}

