package edu.uiowa.slis.VIVOISF.CollectedDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectedDocumentNumPages extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectedDocumentNumPages currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectedDocumentNumPages.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CollectedDocumentNumPagesIterator theCollectedDocument = (CollectedDocumentNumPagesIterator)findAncestorWithClass(this, CollectedDocumentNumPagesIterator.class);
			pageContext.getOut().print(theCollectedDocument.getNumPages());
		} catch (Exception e) {
			log.error("Can't find enclosing CollectedDocument for numPages tag ", e);
			throw new JspTagException("Error: Can't find enclosing CollectedDocument for numPages tag ");
		}
		return SKIP_BODY;
	}
}

