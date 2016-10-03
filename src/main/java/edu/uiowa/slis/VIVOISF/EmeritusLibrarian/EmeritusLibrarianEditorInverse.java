package edu.uiowa.slis.VIVOISF.EmeritusLibrarian;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusLibrarianEditorInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusLibrarianEditorInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusLibrarianEditorInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmeritusLibrarianEditorInverseIterator theEmeritusLibrarianEditorInverseIterator = (EmeritusLibrarianEditorInverseIterator)findAncestorWithClass(this, EmeritusLibrarianEditorInverseIterator.class);
			pageContext.getOut().print(theEmeritusLibrarianEditorInverseIterator.getEditorInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusLibrarian for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusLibrarian for editor tag ");
		}
		return SKIP_BODY;
	}
}

