package edu.uiowa.slis.VIVOISF.EmeritusLibrarian;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusLibrarianResearcherId extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusLibrarianResearcherId currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusLibrarianResearcherId.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EmeritusLibrarianResearcherIdIterator theEmeritusLibrarian = (EmeritusLibrarianResearcherIdIterator)findAncestorWithClass(this, EmeritusLibrarianResearcherIdIterator.class);
			pageContext.getOut().print(theEmeritusLibrarian.getResearcherId());
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusLibrarian for researcherId tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusLibrarian for researcherId tag ");
		}
		return SKIP_BODY;
	}
}

