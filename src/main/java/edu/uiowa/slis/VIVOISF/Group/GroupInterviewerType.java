package edu.uiowa.slis.VIVOISF.Group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GroupInterviewerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GroupInterviewerType currentInstance = null;
	private static final Log log = LogFactory.getLog(GroupInterviewerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GroupInterviewerIterator theGroupInterviewerIterator = (GroupInterviewerIterator)findAncestorWithClass(this, GroupInterviewerIterator.class);
			pageContext.getOut().print(theGroupInterviewerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Group for interviewer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Group for interviewer tag ");
		}
		return SKIP_BODY;
	}
}
