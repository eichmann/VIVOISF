package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartNumPages extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartNumPages currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartNumPages.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentPartNumPagesIterator theDocumentPart = (DocumentPartNumPagesIterator)findAncestorWithClass(this, DocumentPartNumPagesIterator.class);
			pageContext.getOut().print(theDocumentPart.getNumPages());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for numPages tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for numPages tag ");
		}
		return SKIP_BODY;
	}
}

