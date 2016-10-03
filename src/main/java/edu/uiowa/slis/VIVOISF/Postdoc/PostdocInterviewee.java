package edu.uiowa.slis.VIVOISF.Postdoc;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocInterviewee extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocInterviewee currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocInterviewee.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PostdocIntervieweeIterator thePostdocIntervieweeIterator = (PostdocIntervieweeIterator)findAncestorWithClass(this, PostdocIntervieweeIterator.class);
			pageContext.getOut().print(thePostdocIntervieweeIterator.getInterviewee());
		} catch (Exception e) {
			log.error("Can't find enclosing Postdoc for interviewee tag ", e);
			throw new JspTagException("Error: Can't find enclosing Postdoc for interviewee tag ");
		}
		return SKIP_BODY;
	}
}

