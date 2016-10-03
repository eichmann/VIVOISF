package edu.uiowa.slis.VIVOISF.Postdoc;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocIntervieweeInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocIntervieweeInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocIntervieweeInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PostdocIntervieweeInverseIterator thePostdocIntervieweeInverseIterator = (PostdocIntervieweeInverseIterator)findAncestorWithClass(this, PostdocIntervieweeInverseIterator.class);
			pageContext.getOut().print(thePostdocIntervieweeInverseIterator.getIntervieweeInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Postdoc for interviewee tag ", e);
			throw new JspTagException("Error: Can't find enclosing Postdoc for interviewee tag ");
		}
		return SKIP_BODY;
	}
}

