package edu.uiowa.slis.VIVOISF.Postdoc;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocIntervieweeType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocIntervieweeType currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocIntervieweeType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PostdocIntervieweeIterator thePostdocIntervieweeIterator = (PostdocIntervieweeIterator)findAncestorWithClass(this, PostdocIntervieweeIterator.class);
			pageContext.getOut().print(thePostdocIntervieweeIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Postdoc for interviewee tag ", e);
			throw new JspTagException("Error: Can't find enclosing Postdoc for interviewee tag ");
		}
		return SKIP_BODY;
	}
}

