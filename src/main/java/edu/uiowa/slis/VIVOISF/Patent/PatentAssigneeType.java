package edu.uiowa.slis.VIVOISF.Patent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PatentAssigneeType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PatentAssigneeType currentInstance = null;
	private static final Log log = LogFactory.getLog(PatentAssigneeType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PatentAssigneeIterator thePatentAssigneeIterator = (PatentAssigneeIterator)findAncestorWithClass(this, PatentAssigneeIterator.class);
			pageContext.getOut().print(thePatentAssigneeIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Patent for assignee tag ", e);
			throw new JspTagException("Error: Can't find enclosing Patent for assignee tag ");
		}
		return SKIP_BODY;
	}
}

