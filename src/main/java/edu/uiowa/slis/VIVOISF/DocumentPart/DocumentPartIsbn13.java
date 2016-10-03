package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartIsbn13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartIsbn13 currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartIsbn13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentPartIsbn13Iterator theDocumentPart = (DocumentPartIsbn13Iterator)findAncestorWithClass(this, DocumentPartIsbn13Iterator.class);
			pageContext.getOut().print(theDocumentPart.getIsbn13());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for isbn13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for isbn13 tag ");
		}
		return SKIP_BODY;
	}
}

