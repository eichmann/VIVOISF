package edu.uiowa.slis.VIVOISF.Postdoc;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocInterviewerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocInterviewerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocInterviewerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PostdocInterviewerInverseIterator thePostdocInterviewerInverseIterator = (PostdocInterviewerInverseIterator)findAncestorWithClass(this, PostdocInterviewerInverseIterator.class);
			pageContext.getOut().print(thePostdocInterviewerInverseIterator.getInterviewerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Postdoc for interviewer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Postdoc for interviewer tag ");
		}
		return SKIP_BODY;
	}
}

