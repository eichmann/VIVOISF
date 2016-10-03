package edu.uiowa.slis.VIVOISF.EmeritusFaculty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusFacultyInterviewerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusFacultyInterviewerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusFacultyInterviewerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmeritusFacultyInterviewerInverseIterator theEmeritusFacultyInterviewerInverseIterator = (EmeritusFacultyInterviewerInverseIterator)findAncestorWithClass(this, EmeritusFacultyInterviewerInverseIterator.class);
			pageContext.getOut().print(theEmeritusFacultyInterviewerInverseIterator.getInterviewerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusFaculty for interviewer tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusFaculty for interviewer tag ");
		}
		return SKIP_BODY;
	}
}
