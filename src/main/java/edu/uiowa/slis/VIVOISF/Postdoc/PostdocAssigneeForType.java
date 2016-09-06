package edu.uiowa.slis.VIVOISF.Postdoc;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocAssigneeForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocAssigneeForType currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocAssigneeForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PostdocAssigneeForIterator thePostdocAssigneeForIterator = (PostdocAssigneeForIterator)findAncestorWithClass(this, PostdocAssigneeForIterator.class);
			pageContext.getOut().print(thePostdocAssigneeForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Postdoc for assigneeFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Postdoc for assigneeFor tag ");
		}
		return SKIP_BODY;
	}
}

