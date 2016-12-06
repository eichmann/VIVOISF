package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentHasResearchArea extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentHasResearchArea currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentHasResearchArea.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentHasResearchAreaIterator theDocumentHasResearchAreaIterator = (DocumentHasResearchAreaIterator)findAncestorWithClass(this, DocumentHasResearchAreaIterator.class);
			pageContext.getOut().print(theDocumentHasResearchAreaIterator.getHasResearchArea());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for hasResearchArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for hasResearchArea tag ");
		}
		return SKIP_BODY;
	}
}

