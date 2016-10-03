package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherInterviewerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherInterviewerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherInterviewerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PublisherInterviewerInverseIterator thePublisherInterviewerInverseIterator = (PublisherInterviewerInverseIterator)findAncestorWithClass(this, PublisherInterviewerInverseIterator.class);
			pageContext.getOut().print(thePublisherInterviewerInverseIterator.getInterviewerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for interviewer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for interviewer tag ");
		}
		return SKIP_BODY;
	}
}

