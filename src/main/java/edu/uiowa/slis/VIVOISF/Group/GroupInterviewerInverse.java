package edu.uiowa.slis.VIVOISF.Group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GroupInterviewerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GroupInterviewerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(GroupInterviewerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GroupInterviewerInverseIterator theGroupInterviewerInverseIterator = (GroupInterviewerInverseIterator)findAncestorWithClass(this, GroupInterviewerInverseIterator.class);
			pageContext.getOut().print(theGroupInterviewerInverseIterator.getInterviewerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Group for interviewer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Group for interviewer tag ");
		}
		return SKIP_BODY;
	}
}

