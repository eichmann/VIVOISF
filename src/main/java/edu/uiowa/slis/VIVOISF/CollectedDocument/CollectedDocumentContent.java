package edu.uiowa.slis.VIVOISF.CollectedDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectedDocumentContent extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectedDocumentContent currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectedDocumentContent.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CollectedDocumentContentIterator theCollectedDocument = (CollectedDocumentContentIterator)findAncestorWithClass(this, CollectedDocumentContentIterator.class);
			pageContext.getOut().print(theCollectedDocument.getContent());
		} catch (Exception e) {
			log.error("Can't find enclosing CollectedDocument for content tag ", e);
			throw new JspTagException("Error: Can't find enclosing CollectedDocument for content tag ");
		}
		return SKIP_BODY;
	}
}

