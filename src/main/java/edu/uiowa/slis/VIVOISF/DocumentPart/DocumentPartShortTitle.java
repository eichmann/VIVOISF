package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartShortTitle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartShortTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartShortTitle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentPartShortTitleIterator theDocumentPart = (DocumentPartShortTitleIterator)findAncestorWithClass(this, DocumentPartShortTitleIterator.class);
			pageContext.getOut().print(theDocumentPart.getShortTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for shortTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for shortTitle tag ");
		}
		return SKIP_BODY;
	}
}

