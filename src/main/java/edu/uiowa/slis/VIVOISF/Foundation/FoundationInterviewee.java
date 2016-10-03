package edu.uiowa.slis.VIVOISF.Foundation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FoundationInterviewee extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FoundationInterviewee currentInstance = null;
	private static final Log log = LogFactory.getLog(FoundationInterviewee.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FoundationIntervieweeIterator theFoundationIntervieweeIterator = (FoundationIntervieweeIterator)findAncestorWithClass(this, FoundationIntervieweeIterator.class);
			pageContext.getOut().print(theFoundationIntervieweeIterator.getInterviewee());
		} catch (Exception e) {
			log.error("Can't find enclosing Foundation for interviewee tag ", e);
			throw new JspTagException("Error: Can't find enclosing Foundation for interviewee tag ");
		}
		return SKIP_BODY;
	}
}

