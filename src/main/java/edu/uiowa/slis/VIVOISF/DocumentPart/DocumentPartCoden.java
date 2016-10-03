package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartCoden extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartCoden currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartCoden.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentPartCodenIterator theDocumentPart = (DocumentPartCodenIterator)findAncestorWithClass(this, DocumentPartCodenIterator.class);
			pageContext.getOut().print(theDocumentPart.getCoden());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for coden tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for coden tag ");
		}
		return SKIP_BODY;
	}
}

