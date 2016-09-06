package edu.uiowa.slis.VIVOISF.Library;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibraryAssigneeFor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibraryAssigneeFor currentInstance = null;
	private static final Log log = LogFactory.getLog(LibraryAssigneeFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LibraryAssigneeForIterator theLibraryAssigneeForIterator = (LibraryAssigneeForIterator)findAncestorWithClass(this, LibraryAssigneeForIterator.class);
			pageContext.getOut().print(theLibraryAssigneeForIterator.getAssigneeFor());
		} catch (Exception e) {
			log.error("Can't find enclosing Library for assigneeFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Library for assigneeFor tag ");
		}
		return SKIP_BODY;
	}
}

