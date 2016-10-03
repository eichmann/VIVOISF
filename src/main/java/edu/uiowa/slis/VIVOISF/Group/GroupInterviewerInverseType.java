package edu.uiowa.slis.VIVOISF.Group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GroupInterviewerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GroupInterviewerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(GroupInterviewerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GroupInterviewerInverseIterator theGroupInterviewerInverseIterator = (GroupInterviewerInverseIterator)findAncestorWithClass(this, GroupInterviewerInverseIterator.class);
			pageContext.getOut().print(theGroupInterviewerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Group for interviewer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Group for interviewer tag ");
		}
		return SKIP_BODY;
	}
}

