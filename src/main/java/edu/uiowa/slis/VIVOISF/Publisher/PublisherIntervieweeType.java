package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherIntervieweeType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherIntervieweeType currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherIntervieweeType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PublisherIntervieweeIterator thePublisherIntervieweeIterator = (PublisherIntervieweeIterator)findAncestorWithClass(this, PublisherIntervieweeIterator.class);
			pageContext.getOut().print(thePublisherIntervieweeIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for interviewee tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for interviewee tag ");
		}
		return SKIP_BODY;
	}
}

