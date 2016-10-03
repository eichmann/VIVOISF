package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartContent extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartContent currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartContent.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentPartContentIterator theDocumentPart = (DocumentPartContentIterator)findAncestorWithClass(this, DocumentPartContentIterator.class);
			pageContext.getOut().print(theDocumentPart.getContent());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for content tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for content tag ");
		}
		return SKIP_BODY;
	}
}

