package edu.uiowa.slis.VIVOISF.Group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GroupIntervieweeInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GroupIntervieweeInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(GroupIntervieweeInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GroupIntervieweeInverseIterator theGroupIntervieweeInverseIterator = (GroupIntervieweeInverseIterator)findAncestorWithClass(this, GroupIntervieweeInverseIterator.class);
			pageContext.getOut().print(theGroupIntervieweeInverseIterator.getIntervieweeInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Group for interviewee tag ", e);
			throw new JspTagException("Error: Can't find enclosing Group for interviewee tag ");
		}
		return SKIP_BODY;
	}
}

