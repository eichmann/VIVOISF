package edu.uiowa.slis.VIVOISF.Patent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PatentAssignee extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PatentAssignee currentInstance = null;
	private static final Log log = LogFactory.getLog(PatentAssignee.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PatentAssigneeIterator thePatentAssigneeIterator = (PatentAssigneeIterator)findAncestorWithClass(this, PatentAssigneeIterator.class);
			pageContext.getOut().print(thePatentAssigneeIterator.getAssignee());
		} catch (Exception e) {
			log.error("Can't find enclosing Patent for assignee tag ", e);
			throw new JspTagException("Error: Can't find enclosing Patent for assignee tag ");
		}
		return SKIP_BODY;
	}
}

