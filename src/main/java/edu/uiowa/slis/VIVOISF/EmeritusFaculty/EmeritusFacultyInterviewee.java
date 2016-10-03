package edu.uiowa.slis.VIVOISF.EmeritusFaculty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusFacultyInterviewee extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusFacultyInterviewee currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusFacultyInterviewee.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmeritusFacultyIntervieweeIterator theEmeritusFacultyIntervieweeIterator = (EmeritusFacultyIntervieweeIterator)findAncestorWithClass(this, EmeritusFacultyIntervieweeIterator.class);
			pageContext.getOut().print(theEmeritusFacultyIntervieweeIterator.getInterviewee());
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusFaculty for interviewee tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusFaculty for interviewee tag ");
		}
		return SKIP_BODY;
	}
}

