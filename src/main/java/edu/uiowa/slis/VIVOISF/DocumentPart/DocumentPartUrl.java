package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartUrl extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartUrl currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartUrl.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentPartUrlIterator theDocumentPart = (DocumentPartUrlIterator)findAncestorWithClass(this, DocumentPartUrlIterator.class);
			pageContext.getOut().print(theDocumentPart.getUrl());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for url tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for url tag ");
		}
		return SKIP_BODY;
	}
}

