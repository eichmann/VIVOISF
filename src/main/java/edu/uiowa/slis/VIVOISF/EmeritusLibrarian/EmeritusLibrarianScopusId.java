package edu.uiowa.slis.VIVOISF.EmeritusLibrarian;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusLibrarianScopusId extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusLibrarianScopusId currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusLibrarianScopusId.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EmeritusLibrarianScopusIdIterator theEmeritusLibrarian = (EmeritusLibrarianScopusIdIterator)findAncestorWithClass(this, EmeritusLibrarianScopusIdIterator.class);
			pageContext.getOut().print(theEmeritusLibrarian.getScopusId());
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusLibrarian for scopusId tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusLibrarian for scopusId tag ");
		}
		return SKIP_BODY;
	}
}

