package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartEditorListType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartEditorListType currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartEditorListType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentPartEditorListIterator theDocumentPartEditorListIterator = (DocumentPartEditorListIterator)findAncestorWithClass(this, DocumentPartEditorListIterator.class);
			pageContext.getOut().print(theDocumentPartEditorListIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for editorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for editorList tag ");
		}
		return SKIP_BODY;
	}
}

