package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentEditor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentEditor currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentEditor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentEditorIterator theDocumentEditorIterator = (DocumentEditorIterator)findAncestorWithClass(this, DocumentEditorIterator.class);
			pageContext.getOut().print(theDocumentEditorIterator.getEditor());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for editor tag ");
		}
		return SKIP_BODY;
	}
}

