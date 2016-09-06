package edu.uiowa.slis.VIVOISF.EmeritusLibrarian;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusLibrarianRelatedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusLibrarianRelatedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusLibrarianRelatedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmeritusLibrarianRelatedByIterator theEmeritusLibrarianRelatedByIterator = (EmeritusLibrarianRelatedByIterator)findAncestorWithClass(this, EmeritusLibrarianRelatedByIterator.class);
			pageContext.getOut().print(theEmeritusLibrarianRelatedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusLibrarian for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusLibrarian for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

