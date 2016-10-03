package edu.uiowa.slis.VIVOISF.ERO_0000565;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ERO_0000565IntervieweeType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0000565IntervieweeType currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0000565IntervieweeType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ERO_0000565IntervieweeIterator theERO_0000565IntervieweeIterator = (ERO_0000565IntervieweeIterator)findAncestorWithClass(this, ERO_0000565IntervieweeIterator.class);
			pageContext.getOut().print(theERO_0000565IntervieweeIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0000565 for interviewee tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0000565 for interviewee tag ");
		}
		return SKIP_BODY;
	}
}

