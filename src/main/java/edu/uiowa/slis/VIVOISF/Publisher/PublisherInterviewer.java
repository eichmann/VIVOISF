package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherInterviewer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherInterviewer currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherInterviewer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PublisherInterviewerIterator thePublisherInterviewerIterator = (PublisherInterviewerIterator)findAncestorWithClass(this, PublisherInterviewerIterator.class);
			pageContext.getOut().print(thePublisherInterviewerIterator.getInterviewer());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for interviewer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for interviewer tag ");
		}
		return SKIP_BODY;
	}
}

