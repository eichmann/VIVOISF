package edu.uiowa.slis.VIVOISF.EmeritusLibrarian;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusLibrarianOrganizerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusLibrarianOrganizerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusLibrarianOrganizerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmeritusLibrarianOrganizerInverseIterator theEmeritusLibrarianOrganizerInverseIterator = (EmeritusLibrarianOrganizerInverseIterator)findAncestorWithClass(this, EmeritusLibrarianOrganizerInverseIterator.class);
			pageContext.getOut().print(theEmeritusLibrarianOrganizerInverseIterator.getOrganizerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusLibrarian for organizer tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusLibrarian for organizer tag ");
		}
		return SKIP_BODY;
	}
}

