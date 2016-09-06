package edu.uiowa.slis.VIVOISF.EmeritusLibrarian;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusLibrarianHasResearchArea extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusLibrarianHasResearchArea currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusLibrarianHasResearchArea.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmeritusLibrarianHasResearchAreaIterator theEmeritusLibrarianHasResearchAreaIterator = (EmeritusLibrarianHasResearchAreaIterator)findAncestorWithClass(this, EmeritusLibrarianHasResearchAreaIterator.class);
			pageContext.getOut().print(theEmeritusLibrarianHasResearchAreaIterator.getHasResearchArea());
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusLibrarian for hasResearchArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusLibrarian for hasResearchArea tag ");
		}
		return SKIP_BODY;
	}
}

