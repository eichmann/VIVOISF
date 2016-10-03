package edu.uiowa.slis.VIVOISF.Group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GroupIntervieweeInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GroupIntervieweeInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(GroupIntervieweeInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GroupIntervieweeInverseIterator theGroupIntervieweeInverseIterator = (GroupIntervieweeInverseIterator)findAncestorWithClass(this, GroupIntervieweeInverseIterator.class);
			pageContext.getOut().print(theGroupIntervieweeInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Group for interviewee tag ", e);
			throw new JspTagException("Error: Can't find enclosing Group for interviewee tag ");
		}
		return SKIP_BODY;
	}
}

