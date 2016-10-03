package edu.uiowa.slis.VIVOISF.ERO_0000565;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ERO_0000565InterviewerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0000565InterviewerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0000565InterviewerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ERO_0000565InterviewerInverseIterator theERO_0000565InterviewerInverseIterator = (ERO_0000565InterviewerInverseIterator)findAncestorWithClass(this, ERO_0000565InterviewerInverseIterator.class);
			pageContext.getOut().print(theERO_0000565InterviewerInverseIterator.getInterviewerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0000565 for interviewer tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0000565 for interviewer tag ");
		}
		return SKIP_BODY;
	}
}

