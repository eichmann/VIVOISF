package edu.uiowa.slis.VIVOISF.EmeritusLibrarian;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusLibrarianHasCollaboratorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusLibrarianHasCollaboratorType currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusLibrarianHasCollaboratorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmeritusLibrarianHasCollaboratorIterator theEmeritusLibrarianHasCollaboratorIterator = (EmeritusLibrarianHasCollaboratorIterator)findAncestorWithClass(this, EmeritusLibrarianHasCollaboratorIterator.class);
			pageContext.getOut().print(theEmeritusLibrarianHasCollaboratorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusLibrarian for hasCollaborator tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusLibrarian for hasCollaborator tag ");
		}
		return SKIP_BODY;
	}
}

