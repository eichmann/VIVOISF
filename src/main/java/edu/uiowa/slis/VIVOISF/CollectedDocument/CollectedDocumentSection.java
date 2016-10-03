package edu.uiowa.slis.VIVOISF.CollectedDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectedDocumentSection extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectedDocumentSection currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectedDocumentSection.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CollectedDocumentSectionIterator theCollectedDocument = (CollectedDocumentSectionIterator)findAncestorWithClass(this, CollectedDocumentSectionIterator.class);
			pageContext.getOut().print(theCollectedDocument.getSection());
		} catch (Exception e) {
			log.error("Can't find enclosing CollectedDocument for section tag ", e);
			throw new JspTagException("Error: Can't find enclosing CollectedDocument for section tag ");
		}
		return SKIP_BODY;
	}
}

