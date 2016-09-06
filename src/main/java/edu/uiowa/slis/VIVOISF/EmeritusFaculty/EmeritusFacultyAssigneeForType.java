package edu.uiowa.slis.VIVOISF.EmeritusFaculty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusFacultyAssigneeForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusFacultyAssigneeForType currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusFacultyAssigneeForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmeritusFacultyAssigneeForIterator theEmeritusFacultyAssigneeForIterator = (EmeritusFacultyAssigneeForIterator)findAncestorWithClass(this, EmeritusFacultyAssigneeForIterator.class);
			pageContext.getOut().print(theEmeritusFacultyAssigneeForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusFaculty for assigneeFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusFaculty for assigneeFor tag ");
		}
		return SKIP_BODY;
	}
}

