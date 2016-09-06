package edu.uiowa.slis.VIVOISF.OBI_0000835;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OBI_0000835AssigneeFor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OBI_0000835AssigneeFor currentInstance = null;
	private static final Log log = LogFactory.getLog(OBI_0000835AssigneeFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OBI_0000835AssigneeForIterator theOBI_0000835AssigneeForIterator = (OBI_0000835AssigneeForIterator)findAncestorWithClass(this, OBI_0000835AssigneeForIterator.class);
			pageContext.getOut().print(theOBI_0000835AssigneeForIterator.getAssigneeFor());
		} catch (Exception e) {
			log.error("Can't find enclosing OBI_0000835 for assigneeFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing OBI_0000835 for assigneeFor tag ");
		}
		return SKIP_BODY;
	}
}

