package edu.uiowa.slis.VIVOISF.EmeritusLibrarian;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusLibrarianFreetextKeyword extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusLibrarianFreetextKeyword currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusLibrarianFreetextKeyword.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EmeritusLibrarianFreetextKeywordIterator theEmeritusLibrarian = (EmeritusLibrarianFreetextKeywordIterator)findAncestorWithClass(this, EmeritusLibrarianFreetextKeywordIterator.class);
			pageContext.getOut().print(theEmeritusLibrarian.getFreetextKeyword());
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusLibrarian for freetextKeyword tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusLibrarian for freetextKeyword tag ");
		}
		return SKIP_BODY;
	}
}

