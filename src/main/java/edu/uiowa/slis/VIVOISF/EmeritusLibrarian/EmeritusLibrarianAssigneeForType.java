package edu.uiowa.slis.VIVOISF.EmeritusLibrarian;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusLibrarianAssigneeForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusLibrarianAssigneeForType currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusLibrarianAssigneeForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmeritusLibrarianAssigneeForIterator theEmeritusLibrarianAssigneeForIterator = (EmeritusLibrarianAssigneeForIterator)findAncestorWithClass(this, EmeritusLibrarianAssigneeForIterator.class);
			pageContext.getOut().print(theEmeritusLibrarianAssigneeForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusLibrarian for assigneeFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusLibrarian for assigneeFor tag ");
		}
		return SKIP_BODY;
	}
}

