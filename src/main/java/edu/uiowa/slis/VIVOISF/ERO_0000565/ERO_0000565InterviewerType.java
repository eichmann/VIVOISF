package edu.uiowa.slis.VIVOISF.ERO_0000565;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ERO_0000565InterviewerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0000565InterviewerType currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0000565InterviewerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ERO_0000565InterviewerIterator theERO_0000565InterviewerIterator = (ERO_0000565InterviewerIterator)findAncestorWithClass(this, ERO_0000565InterviewerIterator.class);
			pageContext.getOut().print(theERO_0000565InterviewerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0000565 for interviewer tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0000565 for interviewer tag ");
		}
		return SKIP_BODY;
	}
}

