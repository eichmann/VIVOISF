package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartIdentifier extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartIdentifier currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartIdentifier.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentPartIdentifierIterator theDocumentPart = (DocumentPartIdentifierIterator)findAncestorWithClass(this, DocumentPartIdentifierIterator.class);
			pageContext.getOut().print(theDocumentPart.getIdentifier());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for identifier tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for identifier tag ");
		}
		return SKIP_BODY;
	}
}

