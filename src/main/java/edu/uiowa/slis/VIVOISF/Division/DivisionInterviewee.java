package edu.uiowa.slis.VIVOISF.Division;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DivisionInterviewee extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DivisionInterviewee currentInstance = null;
	private static final Log log = LogFactory.getLog(DivisionInterviewee.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DivisionIntervieweeIterator theDivisionIntervieweeIterator = (DivisionIntervieweeIterator)findAncestorWithClass(this, DivisionIntervieweeIterator.class);
			pageContext.getOut().print(theDivisionIntervieweeIterator.getInterviewee());
		} catch (Exception e) {
			log.error("Can't find enclosing Division for interviewee tag ", e);
			throw new JspTagException("Error: Can't find enclosing Division for interviewee tag ");
		}
		return SKIP_BODY;
	}
}

