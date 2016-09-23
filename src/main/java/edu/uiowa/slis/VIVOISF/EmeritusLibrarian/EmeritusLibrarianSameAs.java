package edu.uiowa.slis.VIVOISF.EmeritusLibrarian;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusLibrarianSameAs extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusLibrarianSameAs currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusLibrarianSameAs.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EmeritusLibrarianSameAsIterator theEmeritusLibrarian = (EmeritusLibrarianSameAsIterator)findAncestorWithClass(this, EmeritusLibrarianSameAsIterator.class);
			pageContext.getOut().print(theEmeritusLibrarian.getSameAs());
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusLibrarian for sameAs tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusLibrarian for sameAs tag ");
		}
		return SKIP_BODY;
	}
}

