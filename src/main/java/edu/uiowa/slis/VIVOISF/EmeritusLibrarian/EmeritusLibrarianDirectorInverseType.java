package edu.uiowa.slis.VIVOISF.EmeritusLibrarian;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusLibrarianDirectorInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusLibrarianDirectorInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusLibrarianDirectorInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmeritusLibrarianDirectorInverseIterator theEmeritusLibrarianDirectorInverseIterator = (EmeritusLibrarianDirectorInverseIterator)findAncestorWithClass(this, EmeritusLibrarianDirectorInverseIterator.class);
			pageContext.getOut().print(theEmeritusLibrarianDirectorInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusLibrarian for director tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusLibrarian for director tag ");
		}
		return SKIP_BODY;
	}
}

