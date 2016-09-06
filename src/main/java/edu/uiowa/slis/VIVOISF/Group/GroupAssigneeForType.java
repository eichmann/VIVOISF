package edu.uiowa.slis.VIVOISF.Group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GroupAssigneeForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GroupAssigneeForType currentInstance = null;
	private static final Log log = LogFactory.getLog(GroupAssigneeForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GroupAssigneeForIterator theGroupAssigneeForIterator = (GroupAssigneeForIterator)findAncestorWithClass(this, GroupAssigneeForIterator.class);
			pageContext.getOut().print(theGroupAssigneeForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Group for assigneeFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Group for assigneeFor tag ");
		}
		return SKIP_BODY;
	}
}

