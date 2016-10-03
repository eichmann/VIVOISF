package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartShortDescription extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartShortDescription currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartShortDescription.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentPartShortDescriptionIterator theDocumentPart = (DocumentPartShortDescriptionIterator)findAncestorWithClass(this, DocumentPartShortDescriptionIterator.class);
			pageContext.getOut().print(theDocumentPart.getShortDescription());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for shortDescription tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for shortDescription tag ");
		}
		return SKIP_BODY;
	}
}

