package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartIsbn10 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartIsbn10 currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartIsbn10.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentPartIsbn10Iterator theDocumentPart = (DocumentPartIsbn10Iterator)findAncestorWithClass(this, DocumentPartIsbn10Iterator.class);
			pageContext.getOut().print(theDocumentPart.getIsbn10());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for isbn10 tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for isbn10 tag ");
		}
		return SKIP_BODY;
	}
}

