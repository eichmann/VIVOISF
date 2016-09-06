package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartDocumentationFor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartDocumentationFor currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartDocumentationFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentPartDocumentationForIterator theDocumentPartDocumentationForIterator = (DocumentPartDocumentationForIterator)findAncestorWithClass(this, DocumentPartDocumentationForIterator.class);
			pageContext.getOut().print(theDocumentPartDocumentationForIterator.getDocumentationFor());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for documentationFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for documentationFor tag ");
		}
		return SKIP_BODY;
	}
}

