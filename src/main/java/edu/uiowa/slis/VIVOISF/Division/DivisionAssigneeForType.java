package edu.uiowa.slis.VIVOISF.Division;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DivisionAssigneeForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DivisionAssigneeForType currentInstance = null;
	private static final Log log = LogFactory.getLog(DivisionAssigneeForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DivisionAssigneeForIterator theDivisionAssigneeForIterator = (DivisionAssigneeForIterator)findAncestorWithClass(this, DivisionAssigneeForIterator.class);
			pageContext.getOut().print(theDivisionAssigneeForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Division for assigneeFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Division for assigneeFor tag ");
		}
		return SKIP_BODY;
	}
}

