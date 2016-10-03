package edu.uiowa.slis.VIVOISF.Group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GroupInterviewer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GroupInterviewer currentInstance = null;
	private static final Log log = LogFactory.getLog(GroupInterviewer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GroupInterviewerIterator theGroupInterviewerIterator = (GroupInterviewerIterator)findAncestorWithClass(this, GroupInterviewerIterator.class);
			pageContext.getOut().print(theGroupInterviewerIterator.getInterviewer());
		} catch (Exception e) {
			log.error("Can't find enclosing Group for interviewer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Group for interviewer tag ");
		}
		return SKIP_BODY;
	}
}

