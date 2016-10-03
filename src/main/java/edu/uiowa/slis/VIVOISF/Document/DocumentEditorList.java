package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentEditorList extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentEditorList currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentEditorList.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentEditorListIterator theDocumentEditorListIterator = (DocumentEditorListIterator)findAncestorWithClass(this, DocumentEditorListIterator.class);
			pageContext.getOut().print(theDocumentEditorListIterator.getEditorList());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for editorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for editorList tag ");
		}
		return SKIP_BODY;
	}
}

