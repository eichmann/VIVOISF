package edu.uiowa.slis.VIVOISF.Library;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibraryHasCollaboratorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibraryHasCollaboratorType currentInstance = null;
	private static final Log log = LogFactory.getLog(LibraryHasCollaboratorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LibraryHasCollaboratorIterator theLibraryHasCollaboratorIterator = (LibraryHasCollaboratorIterator)findAncestorWithClass(this, LibraryHasCollaboratorIterator.class);
			pageContext.getOut().print(theLibraryHasCollaboratorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Library for hasCollaborator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Library for hasCollaborator tag ");
		}
		return SKIP_BODY;
	}
}

