package edu.uiowa.slis.VIVOISF.Division;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DivisionAssigneeFor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DivisionAssigneeFor currentInstance = null;
	private static final Log log = LogFactory.getLog(DivisionAssigneeFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DivisionAssigneeForIterator theDivisionAssigneeForIterator = (DivisionAssigneeForIterator)findAncestorWithClass(this, DivisionAssigneeForIterator.class);
			pageContext.getOut().print(theDivisionAssigneeForIterator.getAssigneeFor());
		} catch (Exception e) {
			log.error("Can't find enclosing Division for assigneeFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Division for assigneeFor tag ");
		}
		return SKIP_BODY;
	}
}

