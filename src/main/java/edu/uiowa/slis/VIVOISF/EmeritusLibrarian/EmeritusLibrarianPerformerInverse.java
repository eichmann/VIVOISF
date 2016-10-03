package edu.uiowa.slis.VIVOISF.EmeritusLibrarian;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusLibrarianPerformerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusLibrarianPerformerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusLibrarianPerformerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmeritusLibrarianPerformerInverseIterator theEmeritusLibrarianPerformerInverseIterator = (EmeritusLibrarianPerformerInverseIterator)findAncestorWithClass(this, EmeritusLibrarianPerformerInverseIterator.class);
			pageContext.getOut().print(theEmeritusLibrarianPerformerInverseIterator.getPerformerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusLibrarian for performer tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusLibrarian for performer tag ");
		}
		return SKIP_BODY;
	}
}

