package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartEditorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartEditorType currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartEditorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentPartEditorIterator theDocumentPartEditorIterator = (DocumentPartEditorIterator)findAncestorWithClass(this, DocumentPartEditorIterator.class);
			pageContext.getOut().print(theDocumentPartEditorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for editor tag ");
		}
		return SKIP_BODY;
	}
}

