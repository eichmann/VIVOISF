package edu.uiowa.slis.VIVOISF.Institute;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InstituteAssigneeFor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static InstituteAssigneeFor currentInstance = null;
	private static final Log log = LogFactory.getLog(InstituteAssigneeFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			InstituteAssigneeForIterator theInstituteAssigneeForIterator = (InstituteAssigneeForIterator)findAncestorWithClass(this, InstituteAssigneeForIterator.class);
			pageContext.getOut().print(theInstituteAssigneeForIterator.getAssigneeFor());
		} catch (Exception e) {
			log.error("Can't find enclosing Institute for assigneeFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Institute for assigneeFor tag ");
		}
		return SKIP_BODY;
	}
}

