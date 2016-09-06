package edu.uiowa.slis.VIVOISF.Postdoc;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocAssigneeFor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocAssigneeFor currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocAssigneeFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PostdocAssigneeForIterator thePostdocAssigneeForIterator = (PostdocAssigneeForIterator)findAncestorWithClass(this, PostdocAssigneeForIterator.class);
			pageContext.getOut().print(thePostdocAssigneeForIterator.getAssigneeFor());
		} catch (Exception e) {
			log.error("Can't find enclosing Postdoc for assigneeFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Postdoc for assigneeFor tag ");
		}
		return SKIP_BODY;
	}
}

