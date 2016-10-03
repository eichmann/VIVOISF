package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherIntervieweeInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherIntervieweeInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherIntervieweeInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PublisherIntervieweeInverseIterator thePublisherIntervieweeInverseIterator = (PublisherIntervieweeInverseIterator)findAncestorWithClass(this, PublisherIntervieweeInverseIterator.class);
			pageContext.getOut().print(thePublisherIntervieweeInverseIterator.getIntervieweeInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for interviewee tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for interviewee tag ");
		}
		return SKIP_BODY;
	}
}

