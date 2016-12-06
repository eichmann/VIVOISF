package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartCodeUN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartCodeUN currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartCodeUN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentPartCodeUNIterator theDocumentPart = (DocumentPartCodeUNIterator)findAncestorWithClass(this, DocumentPartCodeUNIterator.class);
			pageContext.getOut().print(theDocumentPart.getCodeUN());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for codeUN tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for codeUN tag ");
		}
		return SKIP_BODY;
	}
}

