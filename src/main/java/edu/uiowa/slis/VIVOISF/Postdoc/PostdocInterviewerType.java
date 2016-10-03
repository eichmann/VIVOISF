package edu.uiowa.slis.VIVOISF.Postdoc;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocInterviewerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocInterviewerType currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocInterviewerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PostdocInterviewerIterator thePostdocInterviewerIterator = (PostdocInterviewerIterator)findAncestorWithClass(this, PostdocInterviewerIterator.class);
			pageContext.getOut().print(thePostdocInterviewerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Postdoc for interviewer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Postdoc for interviewer tag ");
		}
		return SKIP_BODY;
	}
}

