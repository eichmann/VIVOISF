package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartDocumentationForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartDocumentationForType currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartDocumentationForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentPartDocumentationForIterator theDocumentPartDocumentationForIterator = (DocumentPartDocumentationForIterator)findAncestorWithClass(this, DocumentPartDocumentationForIterator.class);
			pageContext.getOut().print(theDocumentPartDocumentationForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for documentationFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for documentationFor tag ");
		}
		return SKIP_BODY;
	}
}

