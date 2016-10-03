package edu.uiowa.slis.VIVOISF.ERO_0000565;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ERO_0000565IntervieweeInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0000565IntervieweeInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0000565IntervieweeInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ERO_0000565IntervieweeInverseIterator theERO_0000565IntervieweeInverseIterator = (ERO_0000565IntervieweeInverseIterator)findAncestorWithClass(this, ERO_0000565IntervieweeInverseIterator.class);
			pageContext.getOut().print(theERO_0000565IntervieweeInverseIterator.getIntervieweeInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0000565 for interviewee tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0000565 for interviewee tag ");
		}
		return SKIP_BODY;
	}
}

