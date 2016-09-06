package edu.uiowa.slis.VIVOISF.School;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SchoolAssigneeFor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SchoolAssigneeFor currentInstance = null;
	private static final Log log = LogFactory.getLog(SchoolAssigneeFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SchoolAssigneeForIterator theSchoolAssigneeForIterator = (SchoolAssigneeForIterator)findAncestorWithClass(this, SchoolAssigneeForIterator.class);
			pageContext.getOut().print(theSchoolAssigneeForIterator.getAssigneeFor());
		} catch (Exception e) {
			log.error("Can't find enclosing School for assigneeFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing School for assigneeFor tag ");
		}
		return SKIP_BODY;
	}
}

