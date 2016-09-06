package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonAssigneeFor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonAssigneeFor currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonAssigneeFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PersonAssigneeForIterator thePersonAssigneeForIterator = (PersonAssigneeForIterator)findAncestorWithClass(this, PersonAssigneeForIterator.class);
			pageContext.getOut().print(thePersonAssigneeForIterator.getAssigneeFor());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for assigneeFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for assigneeFor tag ");
		}
		return SKIP_BODY;
	}
}

