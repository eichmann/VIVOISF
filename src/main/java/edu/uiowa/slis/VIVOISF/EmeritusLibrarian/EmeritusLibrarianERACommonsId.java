package edu.uiowa.slis.VIVOISF.EmeritusLibrarian;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusLibrarianERACommonsId extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusLibrarianERACommonsId currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusLibrarianERACommonsId.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EmeritusLibrarianERACommonsIdIterator theEmeritusLibrarian = (EmeritusLibrarianERACommonsIdIterator)findAncestorWithClass(this, EmeritusLibrarianERACommonsIdIterator.class);
			pageContext.getOut().print(theEmeritusLibrarian.getERACommonsId());
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusLibrarian for eRACommonsId tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusLibrarian for eRACommonsId tag ");
		}
		return SKIP_BODY;
	}
}

