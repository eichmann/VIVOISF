package edu.uiowa.slis.VIVOISF.EmeritusLibrarian;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusLibrarianGeographicFocus extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusLibrarianGeographicFocus currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusLibrarianGeographicFocus.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmeritusLibrarianGeographicFocusIterator theEmeritusLibrarianGeographicFocusIterator = (EmeritusLibrarianGeographicFocusIterator)findAncestorWithClass(this, EmeritusLibrarianGeographicFocusIterator.class);
			pageContext.getOut().print(theEmeritusLibrarianGeographicFocusIterator.getGeographicFocus());
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusLibrarian for geographicFocus tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusLibrarian for geographicFocus tag ");
		}
		return SKIP_BODY;
	}
}

