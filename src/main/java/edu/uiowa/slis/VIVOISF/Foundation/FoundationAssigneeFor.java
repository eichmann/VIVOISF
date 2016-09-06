package edu.uiowa.slis.VIVOISF.Foundation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FoundationAssigneeFor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FoundationAssigneeFor currentInstance = null;
	private static final Log log = LogFactory.getLog(FoundationAssigneeFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FoundationAssigneeForIterator theFoundationAssigneeForIterator = (FoundationAssigneeForIterator)findAncestorWithClass(this, FoundationAssigneeForIterator.class);
			pageContext.getOut().print(theFoundationAssigneeForIterator.getAssigneeFor());
		} catch (Exception e) {
			log.error("Can't find enclosing Foundation for assigneeFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Foundation for assigneeFor tag ");
		}
		return SKIP_BODY;
	}
}

