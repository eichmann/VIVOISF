package edu.uiowa.slis.VIVOISF.EmeritusLibrarian;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusLibrarianPrefixName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusLibrarianPrefixName currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusLibrarianPrefixName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EmeritusLibrarianPrefixNameIterator theEmeritusLibrarian = (EmeritusLibrarianPrefixNameIterator)findAncestorWithClass(this, EmeritusLibrarianPrefixNameIterator.class);
			pageContext.getOut().print(theEmeritusLibrarian.getPrefixName());
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusLibrarian for prefixName tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusLibrarian for prefixName tag ");
		}
		return SKIP_BODY;
	}
}

