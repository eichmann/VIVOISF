package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherInterviewerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherInterviewerType currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherInterviewerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PublisherInterviewerIterator thePublisherInterviewerIterator = (PublisherInterviewerIterator)findAncestorWithClass(this, PublisherInterviewerIterator.class);
			pageContext.getOut().print(thePublisherInterviewerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for interviewer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for interviewer tag ");
		}
		return SKIP_BODY;
	}
}

