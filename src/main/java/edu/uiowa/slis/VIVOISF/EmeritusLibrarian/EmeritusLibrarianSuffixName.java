package edu.uiowa.slis.VIVOISF.EmeritusLibrarian;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusLibrarianSuffixName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusLibrarianSuffixName currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusLibrarianSuffixName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EmeritusLibrarianSuffixNameIterator theEmeritusLibrarian = (EmeritusLibrarianSuffixNameIterator)findAncestorWithClass(this, EmeritusLibrarianSuffixNameIterator.class);
			pageContext.getOut().print(theEmeritusLibrarian.getSuffixName());
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusLibrarian for suffixName tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusLibrarian for suffixName tag ");
		}
		return SKIP_BODY;
	}
}

