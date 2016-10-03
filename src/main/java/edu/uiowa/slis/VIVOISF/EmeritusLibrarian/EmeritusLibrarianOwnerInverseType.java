package edu.uiowa.slis.VIVOISF.EmeritusLibrarian;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusLibrarianOwnerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusLibrarianOwnerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusLibrarianOwnerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmeritusLibrarianOwnerInverseIterator theEmeritusLibrarianOwnerInverseIterator = (EmeritusLibrarianOwnerInverseIterator)findAncestorWithClass(this, EmeritusLibrarianOwnerInverseIterator.class);
			pageContext.getOut().print(theEmeritusLibrarianOwnerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusLibrarian for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusLibrarian for owner tag ");
		}
		return SKIP_BODY;
	}
}

