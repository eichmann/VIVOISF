package edu.uiowa.slis.VIVOISF.EmeritusLibrarian;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusLibrarianOrcidIdType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusLibrarianOrcidIdType currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusLibrarianOrcidIdType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmeritusLibrarianOrcidIdIterator theEmeritusLibrarianOrcidIdIterator = (EmeritusLibrarianOrcidIdIterator)findAncestorWithClass(this, EmeritusLibrarianOrcidIdIterator.class);
			pageContext.getOut().print(theEmeritusLibrarianOrcidIdIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusLibrarian for orcidId tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusLibrarian for orcidId tag ");
		}
		return SKIP_BODY;
	}
}

