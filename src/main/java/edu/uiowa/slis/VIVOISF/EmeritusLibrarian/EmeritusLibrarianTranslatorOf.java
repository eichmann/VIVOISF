package edu.uiowa.slis.VIVOISF.EmeritusLibrarian;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusLibrarianTranslatorOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusLibrarianTranslatorOf currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusLibrarianTranslatorOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmeritusLibrarianTranslatorOfIterator theEmeritusLibrarianTranslatorOfIterator = (EmeritusLibrarianTranslatorOfIterator)findAncestorWithClass(this, EmeritusLibrarianTranslatorOfIterator.class);
			pageContext.getOut().print(theEmeritusLibrarianTranslatorOfIterator.getTranslatorOf());
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusLibrarian for translatorOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusLibrarian for translatorOf tag ");
		}
		return SKIP_BODY;
	}
}

