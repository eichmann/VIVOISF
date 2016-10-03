package edu.uiowa.slis.VIVOISF.CollectedDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectedDocumentEditor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectedDocumentEditor currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectedDocumentEditor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectedDocumentEditorIterator theCollectedDocumentEditorIterator = (CollectedDocumentEditorIterator)findAncestorWithClass(this, CollectedDocumentEditorIterator.class);
			pageContext.getOut().print(theCollectedDocumentEditorIterator.getEditor());
		} catch (Exception e) {
			log.error("Can't find enclosing CollectedDocument for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing CollectedDocument for editor tag ");
		}
		return SKIP_BODY;
	}
}

