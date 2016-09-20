package edu.uiowa.slis.VIVOISF.EmeritusLibrarian;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusLibrarianHasCollaboratorInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusLibrarianHasCollaboratorInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusLibrarianHasCollaboratorInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmeritusLibrarianHasCollaboratorInverseIterator theEmeritusLibrarianHasCollaboratorInverseIterator = (EmeritusLibrarianHasCollaboratorInverseIterator)findAncestorWithClass(this, EmeritusLibrarianHasCollaboratorInverseIterator.class);
			pageContext.getOut().print(theEmeritusLibrarianHasCollaboratorInverseIterator.getHasCollaboratorInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusLibrarian for hasCollaborator tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusLibrarian for hasCollaborator tag ");
		}
		return SKIP_BODY;
	}
}

