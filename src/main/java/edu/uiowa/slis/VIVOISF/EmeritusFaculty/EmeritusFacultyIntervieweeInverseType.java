package edu.uiowa.slis.VIVOISF.EmeritusFaculty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusFacultyIntervieweeInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusFacultyIntervieweeInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusFacultyIntervieweeInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmeritusFacultyIntervieweeInverseIterator theEmeritusFacultyIntervieweeInverseIterator = (EmeritusFacultyIntervieweeInverseIterator)findAncestorWithClass(this, EmeritusFacultyIntervieweeInverseIterator.class);
			pageContext.getOut().print(theEmeritusFacultyIntervieweeInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusFaculty for interviewee tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusFaculty for interviewee tag ");
		}
		return SKIP_BODY;
	}
}

