package edu.uiowa.slis.VIVOISF.ERO_0000565;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ERO_0000565AssigneeForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0000565AssigneeForType currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0000565AssigneeForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ERO_0000565AssigneeForIterator theERO_0000565AssigneeForIterator = (ERO_0000565AssigneeForIterator)findAncestorWithClass(this, ERO_0000565AssigneeForIterator.class);
			pageContext.getOut().print(theERO_0000565AssigneeForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0000565 for assigneeFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0000565 for assigneeFor tag ");
		}
		return SKIP_BODY;
	}
}

