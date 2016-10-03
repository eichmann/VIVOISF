package edu.uiowa.slis.VIVOISF.CollectedDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectedDocumentEditorList extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectedDocumentEditorList currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectedDocumentEditorList.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectedDocumentEditorListIterator theCollectedDocumentEditorListIterator = (CollectedDocumentEditorListIterator)findAncestorWithClass(this, CollectedDocumentEditorListIterator.class);
			pageContext.getOut().print(theCollectedDocumentEditorListIterator.getEditorList());
		} catch (Exception e) {
			log.error("Can't find enclosing CollectedDocument for editorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing CollectedDocument for editorList tag ");
		}
		return SKIP_BODY;
	}
}

