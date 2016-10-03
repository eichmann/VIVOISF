package edu.uiowa.slis.VIVOISF.Group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GroupInterviewee extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GroupInterviewee currentInstance = null;
	private static final Log log = LogFactory.getLog(GroupInterviewee.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GroupIntervieweeIterator theGroupIntervieweeIterator = (GroupIntervieweeIterator)findAncestorWithClass(this, GroupIntervieweeIterator.class);
			pageContext.getOut().print(theGroupIntervieweeIterator.getInterviewee());
		} catch (Exception e) {
			log.error("Can't find enclosing Group for interviewee tag ", e);
			throw new JspTagException("Error: Can't find enclosing Group for interviewee tag ");
		}
		return SKIP_BODY;
	}
}

